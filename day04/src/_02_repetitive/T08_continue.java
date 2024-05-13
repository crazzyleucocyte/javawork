package _02_repetitive;

public class T08_continue {

	public static void main(String[] args) {
		//continue: 실행문을 실행하지 않고 다시 반복문을 실행 ~을 제외할때 많이 사용
		
		//1~100까지 23의 배수를 제외한 합계 구하기
		
		int sum = 0;
		for(int i= 1;i<=100;i++){
			if(i%3==0)
				continue;
			sum+=i;
		}
		System.out.println("1~100까지 3의 배수를 제외한 합계:"+sum);
		
		//같은 자료형일떄
		/*
		 * int num1 = 4;
		 * int num2 = 9;
		 * int num3 = 5;
		 * 
		 * 
		 * 		
		*/	
		int num1, num2, num3,num4;
//		int num1=2, num2=9, num3=5;
		num1=num2=num3=num4=5;
		//위처럼 모두 가능
		
		//for문 사용시 여러개의 변수 사용 가능
		for(int i=1, j=20;i<=10||j>=10;i++,j--){
			System.out.println(i+", "+j);
		}
		for(int i = 1, j=20, x=15,y=3;j>=10;i++,j--,x-=2,y+=5) {
			System.out.println(i+","+j+","+x+","+y);
		}
		
		System.out.println("------------------");
		
		//while(true) 무한반복과 동일
		for(;;) {//조건 없음
			System.out.println(num4);
			if(num4==8)break;//num4가 8이 되면 탈출
			num4++;
		}
		System.out.println("------------------");
		
		//중첩for문에서 원하는 반복문을 빠져나오고 싶을때
		//헐 for문 앞에 이름을 넣으면 for문을 지정 할 수 있어!
		forloop :for(int dan=2;dan<=9;dan++) {
			for(int i =1;i<=9;i++) {
				System.out.println(dan+"*"+i+"="+dan*1);
				whatif:if(i==5)break forloop; 
				//이름을 지정하지 않으면 break가 있는 중괄호만 빠져나오지만 
//				그 뒤에 지정한 이름을 입력하면 그 이름이 있는 for문을 빠져나온다
			}
			
		}


		
		forloop :for(int dan=2;dan<=9;dan++) {
			mid:for(int i =1;i<=9;i++) {
				for(int z = 1;z<=5;z++) {
					System.out.println(dan+","+i+","+z);
					if(z==3) break forloop;
				}
				System.out.println("mid for문 종료");
			}
			
		}
		System.out.println("------------------");
		
		
	}

}
