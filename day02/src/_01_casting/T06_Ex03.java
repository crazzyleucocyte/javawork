package _01_casting;

import java.util.Scanner;

public class T06_Ex03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		1. 실습문제
//		키보드로 부터 하나의 정수 입력받기
//		그 정수가 음수이면 "음수"를 출력, 음수가 아니면 "음수가 아니다"를 출력하기
		System.out.print("음수와 양수를 판단하기 위해 정수를 입력해주세요. : ");
		int int1 = s.nextInt();
		if(int1<0) System.out.println("음수입니다.");
	    if(int1>0) System.out.println("음수가 아닙니다.");

//		2. 실습문제
//		키보드로 부터 하나의 정수 입력받기
//		그 정수가 음수이면 "음수"를 출력,
//		음수가 아닌 경우 중 0이면 "0이다"를 출력, 0이 아니면 "양수"를 출력
        System.out.print("음수, 양수, 0을 판단하기 위해 정수를 입력해주세요 : ");
        int int2=s.nextInt();
        if(int2<0) {
	        System.out.println("음수입니다.");
        } else if(int2==0) {
	        System.out.println("0입니다.");
        }else {System.out.println("양수입니다.");}
	    
//		3. 실습문제
//		키보드로 부터 하나의 정수 입력받기
//		그 정수가 짝수이면 "짝수"를 출력,
//		짝수가 아니면 "홀수"를 출력
        
        System.out.print("짝수, 홀수를 판단하기 위해 정수를 입력해주세요 : ");
        int int3=s.nextInt();
        int int3_2=int3%2;
        if (int3_2==0) {
			System.out.println("짝수입니다.");
		}else if (int3_2==1) {
			System.out.println("홀수입니다.");
		}


//		4. 실습문제
//		모든 사람이 사탕을 골고루 나눠가지려고 한다
//		인원 수와 사탕의 개수를 키보드로 입력 받고
//		1인다 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하기
        System.out.println("사탕을 동일하게 나눠가져가기 위해");
        System.out.print("인원수를 입력해주세요 : ");
        int people = s.nextInt();
        System.out.print("사탕개수를 입력해주세요 : ");
        int candy = s.nextInt();
        System.out.println("1인당 사탕 개수 : " +(candy/people));
        System.out.println("남는 사탕개수 : " +(candy%people));

//		ex.
//		인원수 : 29
//		사탕개수 : 100

//		1인당 사탕 개수 : 3
//		남는 사탕 개수 : 13

//		5. 실습문제
//		키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하시오
//		이 때, 성별이 'M'이면 남학생, 'M'아 아니면 여학생으로 출력하시오.

        System.out.print("이름 : ");
        String name = s.nextLine();
        name = s.nextLine();
        System.out.print("학년(숫자만) : ");
        int grade = s.nextInt();
        System.out.print("반(숫자만) : ");
        int classes = s.nextInt();
        System.out.print("번호(숫자만) : ");
        int num = s.nextInt();
        System.out.print("성별을 입력해주세요(M/W)");
        String gender = s.nextLine();
        gender = s.nextLine();
        if(gender.equals("M")) {
        	System.out.println("남학생");
        }else if (gender.equals("W")) {
        	System.out.println("여학생");			
		}
        System.out.print("성적 : ");
        double score = s.nextDouble();
        System.out.printf("%.2f",score);
        System.out.printf(grade +"학년 "+classes+"반 "+num+"번 "+name+" "+gender+"의 성적은 %.2f"+"이다.",score);
        
//		ex.
//		이름 : 이준기
//		학년(숫자만) : 2
//		반(숫자만) : 7
//		번호(숫자만) : 3
//		성별(M/F) : M
//		성적(소수점 둘째 짜리까지) : 97.35

//		2학년 7반 3번 이준기 남학생의 성적은 97.35이다.

//		6. 실습문제
//		나이를 키보드로 입력 받아 13세 이하면 "어린이"를 출력
//		13세초과 ~ 19세 이하이면 "청소년" 출력
//		19세초과이면 "성인" 출력
        System.out.print("\n어린이, 청소년, 성인을 판단하기 위해 나이를 입력해주세요 : ");
        int age = s.nextInt();
        if(age<=13)System.out.println("어린이");
        else if(age>13&&age<=19)System.out.println("청소년");
        else if(age>19)System.out.println("성인");
        

//		7. 실습문제
//		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
//		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
        System.out.print("국어 점수를 입력해주세요 : ");
		int kor = s.nextInt();
		System.out.print("영어 점수를 입력해주세요 : ");
		int eng = s.nextInt();
		System.out.print("수학 점수를 입력해주세요 : ");
		int mat = s.nextInt();
		int sum =kor+eng+mat;
		double avg = (double)sum/3;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		if(kor>=40 && eng>=40 && mat>=40 && avg>=60) System.out.println("합격입니다.");
		else System.out.println("불합격입니다.");
        
        
        
//		ex.
//		국어 : 60
//		영어 : 80
//		수학 : 40
//
//		합계 : 180
//		평균 : 60.0
//		합격

//		8. 실습문제
//		주민번호를 입력받아 나자인지 여자인지 출력하기
        do {
        System.out.print("주민등록 번호를 입력해주세요(-포함): ");
		String id = s.nextLine();
		id = s.nextLine();
        char idGender = id.charAt(7);
        char highpen = id.charAt(6);
        if(id.length()!=14) {
        	System.out.println("주민등록번호 13자리(-포함)를 올바르게 입력해주세요");
        	continue;
        }
        else if(highpen!='-') {
        	System.out.println("하이픈(-)을 넣어주세요");
        	continue;
        }else if(idGender=='1'||idGender=='3') {
        	System.out.println("당신은 남자입니다.");
        	break;
        }else if(idGender=='2'||idGender=='4') {
        	System.out.println("당신은 여자입니다.");
        	break;
        }
        
        }while(true);

//		ex.
//		주민번호를 입력하세요(- 포함) : 123456-3123456

//		여자
	}

}
