package _05_Thread;

public class T07_ThreadGroup {

	public static void main(String[] args) {
		//기본 메인 쓰레드이름 출력
		ThreadGroup thmain =Thread.currentThread().getThreadGroup();
		System.out.println(thmain.getName());
		
		//쓰레드 그룹 생성 방법
		ThreadGroup grp1=new ThreadGroup("Group1");
		ThreadGroup grp2=new ThreadGroup("Group2");
		ThreadGroup subGrp1=new ThreadGroup(grp1,"SubGroup1");//그룹1 아래에 그룹을 만들었다
		
		//클래스에서 러너블을 구현하지 않고 익명클래스로 객체를 만들어 쓰레드를 돌린다.
		Runnable r = new Runnable() {
			public void run() {
				
				for(int i = 0; i<4;i++) {
					System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			}
		};
		
		//쓰레드 생성자 메소드는 3개짜리도 있다(쓰레드 그룹,러너블, 이름)
		
		Thread th1 = new Thread(grp1,r,"th1");
		//th1 쓰레드는 grp1쓰레드 그룹에 속해있으며, 쓰레드할 내용은 러너블 r이고, 이름은 th1이다
		Thread th2 = new Thread(grp2,r,"th2");
		Thread th3 = new Thread(subGrp1,r,"th3");
		
		th1.start();
		th2.start();
		th3.start();
		
		//getName: 쓰레드의 이름을 가져오는 메소드
		System.out.println("List of ThreadGroup : "+ thmain.getName());
		
		//.activegroupcount : 돌아가고 있는 쓰레드 그룹 카운트
		System.out.println("Active ThreadGroup : "+thmain.activeGroupCount());//3(main, grp1, grp2)
		
		//activcount : 돌아가고 있는 쓰레드 카운드
		//두 개가 다른 이유는 하나의 쓰레드가 하위 쓰레드그룹으로 들어갔기 때문
		System.out.println("Active Thread : "+thmain.activeCount());//4((main, grp1, grp2,subGrp1)
		
		//이 클래스의 쓰래드 목록 출력
		thmain.list();
		
		
		
	}

}
