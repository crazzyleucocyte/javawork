package _05_Thread;

public class T04_SingleThreadTime {

	public static void main(String[] args) {
		//이 for문의 소요시간이 궁금하다
		
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		for(int i = 0;i<500;i++) {
			System.out.println("&");
		}
		System.out.println();
		long endTime = System.currentTimeMillis();
		System.out.println("소요 시간"+(endTime-startTime));
		
		for(int i = 0;i<500;i++) {
			System.out.println("#");
		}
		endTime = System.currentTimeMillis();
		System.out.println("소요 시간"+(endTime-startTime));
		
		
	}

}
