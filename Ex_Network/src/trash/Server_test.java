package trash;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import network.Clients_Reader;

//reader
class Server_tst implements Runnable{
//	Scanner s = new Scanner(System.in);
	Socket socket;
	static boolean endCheck=true;
	static String name;

	synchronized static boolean endCheck(boolean check) {
		return endCheck=check;
	}

	
	public Server_tst(Socket socket) {
		this.socket = socket;
	}
	
	public void setSocket(Socket socket) {
		this.socket = socket;
	}


	@Override
	public void run() {
		try(BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pr=new PrintWriter(socket.getOutputStream(),true);){

			pr.println("환영합니다.");
			pr.println("닉네임을 입력해주세요 : ");
			pr.flush();
			name = br.readLine();

//			Reader read = new Reader(name,br,pr);
//			Thread thr = 
					new Thread(new Clients_Reader(name,br,pr),name).start();;
//			Thread.currentThread().setName(name);
//			thr.setDaemon(true);
//			thr.start();
//			thr.join();
//			String msg=null;
			while(true) {
				Thread.sleep(10000);
			}


		} catch (Exception e) {
//			s.close();
			e.printStackTrace();

		}

	}
}
class acceptsever implements Callable<Socket>{
	
	ServerSocket serverSocket;
	Socket socket;
	static List <PrintWriter> clientList = new ArrayList<PrintWriter>();
	
	
	public acceptsever() {
	}
	public acceptsever(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}

	@Override
	public Socket call() throws Exception {
		int i=0;
		while(i !=10) {
			try{
				System.out.println("클라이언트의 접속을 기다리는 중...");
				socket= serverSocket.accept();	//accept의 반환형이 socket이므로 소켓=서버소켓.accept를 해줘야 한다.
				System.out.println(socket.getInetAddress().getHostAddress()+"가 접속을 요청함");
			
				synchronized(clientList) {
					clientList.add(new PrintWriter(socket.getOutputStream(),true));
				}
			
				new Thread(new Server_tst(socket)).start();
				System.out.println();
			}catch(Exception e) {
				e.printStackTrace();
			}
			i++;
		}
		return socket;
	}
}

// 쓰레드 메소드 중 wait을 써서 클라이언트가 처음에 보내기 전까지는 기다리도록 할 수도 있다 
public class Server_test {
	acceptsever acc = new acceptsever();

	static boolean endCheck=true;

	synchronized static boolean endCheck(boolean check) {
		return endCheck=check;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String out;
		int port = 9001;

		try (ServerSocket serverSocket = new ServerSocket(port)){

			acceptsever acc = new acceptsever(serverSocket);
			ExecutorService executor = Executors.newSingleThreadExecutor();
			Future<Socket> fture = executor.submit(acc); //서버에서 클라이언트를 계속 받는 쓰레드 실행 

			//			Thread writer= new Thread(new write());
			//			writer.start();
//			Turn write = new Turn();
			chat :while(endCheck!=false) {
				//					ExecutorService executor2 = Executors.newSingleThreadExecutor();
				//					Future<String> future2 = executor.submit(write); //
				//					String out =future2.get();
				//						Thread.sleep(100);
//				System.out.println(135215);
				System.out.print("서버 : "+(out=s.nextLine()));
				System.out.println();
				for(int i=0;i<acc.clientList.size();i++) {
//					System.out.println(968975);
					acc.clientList.get(i).println(out);
//							pr.flush();
//					executor.shutdown();
					if(out.equalsIgnoreCase("!exit")) {
						acc.clientList.get(i).println("클라이언트가 대화 종료를 했습니다.");
						endCheck(false);
						break;
					}
					if(acc.clientList.size()==0) {
						break chat;
					}
				}
			}
			System.out.println("대화를 종료합니다.");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

//		catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ExecutionException e) {asdf
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}



		//					while(read.endCheck&&endCheck!=false) {
		//						System.out.println();
		//						System.out.print("서버 : "+(msg=s.nextLine()));
		//						System.out.println(Thread.currentThread().getName());
		//						pr.println(msg);
		//						pr.flush();
		//						if(msg.equals("!exit")) {
		//							pr.println("서버가 대화 종료를 했습니다.");
		//							endCheck(false);
		//							break;
		//						}
		//					}
		//					System.out.println("대화를 종료합니다.");
		//				clientList.add(fture.get());
		//				System.out.println(clientList);



/*

		Scanner s = new Scanner(System.in);
		int port = 9001;

		Thread thread2= new Thread();
		Socket socket=null;
		try(ServerSocket serverSocket = new ServerSocket(port);
				) {
			System.out.println("클라이언트의 접속을 기다리는 중...");
			socket= serverSocket.accept();	//accept의 반환형이 socket이므로 소켓=서버소켓.accept를 해줘야 한다.
			System.out.println(socket.getInetAddress().getHostAddress()+"가 접속을 요청함");
		} catch (Exception e) {
			s.close();
			e.printStackTrace();
		}


			try(
					BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pr=new PrintWriter(socket.getOutputStream(),true);){


				//			InputStream is = socket.getInputStream();
				//			OutputStream os = socket.getOutputStream();

				//			BufferedReader br= new BufferedReader(new InputStreamReader(is));
				//			PrintWriter pr=new PrintWriter(os,true);

				pr.println("환영합니다.");
				pr.println("닉네임을 입력해주세요 : ");
				pr.flush();
				String name = br.readLine();

				/*Runnable r = new Runnable() {

					@Override
					public void run() {
						try {
							String read =null;
							while((!(read = br.readLine()).equals(null))||endCheck!=false) {
								System.out.println("\n클라이언트 : "+read);
								if(read.equals("!today")) {
									pr.println(date.format(now));
								}else if(read.equals("!exit")) {

									System.out.println("클라이언트가 대화를 종료했습니다.");
									endCheck(false);
									break;
								}
							}
						} catch (NullPointerException e) {
							System.out.println("클라이언트가 대화를 종료했습니다.");
							endCheck(false);

						} catch (SocketException e) {
							System.out.println("클라이언트가 접속을 종료했습니다.");
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}



			};

				Reader read = new Reader(name,br,pr);

				Thread thr = new Thread(read);
				thr.setDaemon(true);
				thr.start();
				String msg;

				while(read.endCheck&&endCheck!=false) {
					System.out.println();
					System.out.print("서버 : "+(msg=s.nextLine()));
					pr.println(msg);
					pr.flush();
					if(msg.equals("!exit")) {
						pr.println("서버가 대화 종료를 했습니다.");
						endCheck(false);
						break;
					}
				}
				System.out.println("대화를 종료합니다.");
			}
		} catch (Exception e) {
			s.close();
			e.printStackTrace();
		}




	}











}
 */


