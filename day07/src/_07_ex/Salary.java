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
	final static double BonusPoint=0.1;
	String phone;
	String address;
	String infos[]=new String[11];
	int workedYear;

	static String quest[]={
	"empNo : ","사원 이름 : ","부서 : "
	,"직위 : ","나이 : ","성별 : "
	,"급여 : ","보너스 배율 : ","전화번호 : "
	,"주소 : ","근속년도 : "};
//
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
		
		infos= new String[] {Integer.toString(empNo),empName,dept
				,job,Integer.toString(age)+" 살",gender,changePrice(salary)+" 원"
				,Double.toString(BonusPoint)+"%",phone,address
				,changePrice(workedYear)+"\n"
		};
		sempNo++;
		
		
//		infos[0]=Integer.toString(empNo);
//		infos[1]=empName;
//		infos[2]=dept;
//		infos[3]=job;
//		infos[4]=Integer.toString(age)+" 살";
//		infos[5]=gender;
//		infos[6]=changePrice(salary)+" 원";
//		infos[7]=Double.toString(BonusPoint)+"%";
//		infos[8]=phone;
//		infos[9]=address;
//		infos[10]=changePrice(workedYear)+"\n";
//		
	}

	void PrintOut() {
		for(int i =0;i<quest.length;i++) {
			System.out.print(quest[i]);
			System.out.println(infos[i]);
		}
	}
	
	 String Bounus() {
		int bonus=(int)(salary*((workedYear/15)+BonusPoint));
		return changePrice(bonus)+"원";
	}





}
