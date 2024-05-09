package _01_operation;

import java.util.Scanner;

public class T06_Ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		1. 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
		/*System.out.print("정수를 입력해주세요 :");
		int num = s.nextInt();
		System.out.println(num>0?"양수다.":"양수가 아니다.");
		
//		2. 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
//		양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		System.out.print("\n"+"정수를 입력해주세요 : ");
		int num2 = s.nextInt();
		System.out.println(num2>0?"양수다.":num2<0?"음수다.":"0이다.");
		
//		3.키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		
		System.out.print("\n"+"정수를 입력해주세요 : ");
		int num3 = s.nextInt();
		System.out.println((num3%=2)==0?"짝수다":"홀수다");		
//
//		4. 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 
//		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		System.out.print("\n"+"사탕을 나눠먹을 인원 수를 입력해주세요 : ");
		int people = s.nextInt();
		System.out.print("나눠먹을 사탕의 갯수를 입력해주세요 : ");
		int candy =s.nextInt();
		System.out.println("1인당 사탕 개수 : "+(candy/people)+", 나눠주고 남은 사탕 갯수 : "+(candy%people));
		
//
//		5. 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
//		이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
		
		System.out.print("\n"+"이름 : ");
        String name = s.nextLine();
        name = s.nextLine();
        
        System.out.print("학년(숫자만) : ");
        int grade = s.nextInt();
        
        System.out.print("반(숫자만) : ");
        int classes = s.nextInt();
        
        System.out.print("번호(숫자만) : ");
        int num4 = s.nextInt();    
        
		System.out.print("성별을 입력해주세요(M/W) : ");
		String gender = s.nextLine();
		gender =s.nextLine();
		String gender1 = gender.equals("W")?"여학생":(gender.equals("M")?"남학생":" ");
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = s.nextDouble();
		
		System.out.println(grade+"학년 "+classes+"반 "+num4+"번 "+name+" "+gender1+"의 성적은 "+score+"이다.");
		
//		ex.
//		  이름 : 박신우
//		  학년(숫자만) : 3
//		  반(숫자만) : 4
//		  번호(숫자만) : 15
//		  성별(M/F) : F
//		  성적(소수점 아래 둘째자리까지) : 85.75
//
//		  3학년 4반 15번 박신우 여학생의 성적은 85.75이다.
////
//		6. 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
//		성인(19세 초과)인지 출력하세요.
		System.out.print("\n"+"어린이, 청소년, 성인을 판단하기 위해 나이를 입력해주세요 : ");
		int age = s.nextInt();
		System.out.println(age<=13?"어린이입니다.":(age<=19?"청소년입니다.":"성인입니다."));
		
//
//		7. 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
//		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 
//		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		System.out.print("\n"+"국어 점수를 입력해주세요 : ");
		double kor = s.nextDouble();
		System.out.print("영어 점수를 입력해주세요 : ");
		double eng = s.nextDouble();
		System.out.print("수학 점수를 입력해주세요 : ");
		double mat = s.nextDouble();
		double sum = kor+eng+mat;
		System.out.println(kor>=40 && eng>=40 && mat>=40 && (sum/3)>=60?"합격입니다.":"불합격입니다.");
		
//
//		8. 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		System.out.print("\n"+"주민번호를 입력해주세요(\'-포함\'14자리) : ");
		String idNum = s.nextLine();
		idNum=s.nextLine();
		char hyphen =idNum.charAt(6);
		char gender3 =idNum.charAt(7);
		System.out.println(hyphen=='-'?(gender3=='1'||gender3=='3'?"당신은 남자입니다.":(gender3=='2'||gender3=='4'?"당신은 여자입니다.":"성별을 구분할 수 없습니다.")):"\'-\'을 포함해주세요.");
		*/
//
//		9. 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
//		그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
//		아니면 false를 출력하세요.
//		(단, num1은 num2보다 작아야 함)
		
		System.out.println("정수 3개 입력(공백으로 분리) : ");
		int num5 = s.nextInt();
		int num6 = s.nextInt();
		int num7 = s.nextInt();
		System.out.println(num5>=num7||num7>num6?true:false);
		
		
		
//		ex.
//		   정수1 : 4
//		   정수2 : 11
//		   입력 : 13
//
//		   true
//
//		10. 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		System.out.print("\n"+"첫번째 정수를 입력해주세요 : ");
		int num8 = s.nextInt();		
		System.out.print("두번째 정수를 입력해주세요 : ");
		int num9 = s.nextInt();		
		System.out.print("세번째 정수를 입력해주세요 : ");
		int num10 = s.nextInt();		
		System.out.println(num8==num9&&num9==num10&&num8==num10?true:false);
		
	}

}
