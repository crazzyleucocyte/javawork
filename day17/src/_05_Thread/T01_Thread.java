package _05_Thread;
//쓰레드를 쓰려면 쓰레드나 러너블을 상속 받아야 한다 그리고 런 메소드를 꼭 오버라이딩 해줘야 하고 
//내용은 쓰레드를 돌릴 메소드이다.

class Thread1 extends Thread{
	@Override
	public void run() {
		setName("my쓰레드");
		for(int i=1;i<500;i++) {
			System.out.println(i);
			System.out.println(getName());
		}
	}
}
class Thread2 implements Runnable{
	@Override
	public void run() {
		Thread.currentThread().setName("imple쓰레드");
		for(int i =1000;i<1500;i++) {
			System.out.println(i);
		}
	}
}



class T01_Thread {

	public static void main(String[] args) {
		//쓰레드를 상속 받은 경우 오른쪽에 new 클래스명();으로 쓰고
		Thread t1 = new Thread1();
		t1.start();
		
		//러너블을 구현한 경우  new Thread(new 클래스명());으로 쓴다.
		Thread t2 = new Thread(new Thread2());
		t2.start();
	}

}
