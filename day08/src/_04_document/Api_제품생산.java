package _04_document;

public class Api_제품생산 {

	int serialNo;
	static int sserialNo;
	static int countprd;
	
	
	Api_제품생산(){
//		sserialNo++;
		serialNo= ++sserialNo;
		countprd++;
	}
	String GetSerialNo() {
		return "시리얼 번호 : 더조은 "+serialNo;
		//이렇게 하는것 보다 생성자 메소드에 string으로 한번에 만들어버리는게 빠르다
	}
	

}
