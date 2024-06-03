package _05_Thread;

class AutoSaveThread extends Thread{
	//데몬쓰레드는 보조 쓰레드이기 때문에 메인 쓰레드가 끝나면 같이 끝나기 때문에 보통 무한반복으로 한다
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
			autoSave();
		}
	}
	void autoSave() {
		System.out.println("파일이 자동저장 되었습니다.");
	}
	
	
}
public class T08_DaemonThread {

	public static void main(String[] args) {
		AutoSaveThread auto = new AutoSaveThread();
		//auto를 데몬 쓰레드로 지정
		auto.setDaemon(true);
		auto.start();
		
		for(int i = 0;i<=10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
		
		
		
	}

}
