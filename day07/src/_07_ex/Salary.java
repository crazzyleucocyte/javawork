package _07_ex;

import java.util.Arrays;

import java.util.Scanner;

public class Salary extends T01_api_book {

	
	
	
	
	
	
	
	static int sempNo=1;
	int empNo;
	String empName;
	String dept;
	String job;
	int age;
	String gender;
	int salary;
	static double bonusPoint=0.1;
	String phone;
	String address;
	String infos[]=new String[11];
	static String quest[]=new String[11];
	int workedYear;

	//생성자
	/*
	 * 매개변수가 없는 생성자

	 * 매개변수로 empName,dept,job
	 * 메소드
	 * 보너스 계산하는 메소드(salary, bonusPoint)
	 * 메소드 내에서 출력해줌
	 * 
	 * 보너스 계산하는 메소드(salary)
	 * bonusPoint 0.1로 계산하여
	 * 메소드 내에서 출력해줌
	 * empName=홍길동
	 * dept 영업부
	 * job=과장
	 * age=25
	 * gender=남
	 * salary=2500000
	 * bonusPoint=0.05
	 * Phone 010-1234-5678
	 * address =서울시 강남구
	 */

	Scanner info = new Scanner(System.in);
	

	
	public Salary() {

		empNo=sempNo;







	}

	public Salary(String empName,String dept,String job, int age, String gender,int salary,String phone,String address,int workedYear) {
		this();
		this.empName=empName;
		this.dept=dept;
		this.age=age;
		this.job=job;
		this.gender=gender;
		this.salary=salary;
		this.phone=phone;
		this.address=address;
		this.workedYear=workedYear;
		infos[0]=Integer.toString(empNo);
		sempNo++;
		infos[1]=empName;
		infos[2]=dept;
		infos[3]=job;
		infos[4]=Integer.toString(age)+" 살";
		infos[5]=gender;
		infos[6]=changePrice(salary)+" 원";
		infos[7]=Double.toString(bonusPoint)+"%";
		infos[8]=phone;
		infos[9]=address;
		infos[10]=changePrice(workedYear);
		


		quest[0]= "empNo : ";
		quest[1]="사원 이름 : ";
		quest[2]="부서 : ";
		quest[3]="직위 : ";
		quest[4]="나이 : ";
		quest[5]="성별 : ";
		quest[6]="급여 : ";
		quest[7]="보너스 배율 : ";
		quest[8]="전화번호 : ";
		quest[9]="주소 : ";
		quest[10]="근속년도 : ";
	}

	void PrintOut() {


		for(int i =0;i<quest.length;i++) {
			System.out.print(quest[i]);
			System.out.println(infos[i]);

		}
	}
	
	 String Bounus() {
		int bonus=(int)(salary*((workedYear/15)+bonusPoint));
		
		return changePrice(bonus)+"원";
	}





}
