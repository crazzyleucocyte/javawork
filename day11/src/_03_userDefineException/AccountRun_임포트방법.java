package _03_userDefineException;

import _01_anonymous.TestMain;//같은 프로젝트는 그냥 임포트
import _02_bank.T01_api_bank;//다름 프로젝트에 있는거를 쓰려면 property, project로 하면 된다.

public class AccountRun_임포트방법 {
	public static void main(String[] args) {
		T01_api_bank bank = new T01_api_bank();
		TestMain aa = new TestMain();
		
		
	}
	
}
