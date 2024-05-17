package _04_document;

public class Main_제품생산 {

	String serialNo;
	static int count;
	
	Main_제품생산(){
		serialNo="더조은"+ ++count;
	}
	
	
	public static void main(String[] args) {

		Api_제품생산 a1= new Api_제품생산();
		System.out.println(a1.GetSerialNo());
		Api_제품생산 a2= new Api_제품생산();
		System.out.println(a2.GetSerialNo());

		Api_제품생산 a3= new Api_제품생산();
		System.out.println(a3.GetSerialNo());
		Api_제품생산 a4= new Api_제품생산();
		System.out.println(a4.GetSerialNo());
		Api_제품생산 a5= new Api_제품생산();
		System.out.println(a5.GetSerialNo());
		Api_제품생산 a6= new Api_제품생산();
		System.out.println(a6.GetSerialNo());
		Api_제품생산 a7= new Api_제품생산();
		System.out.println(a7.GetSerialNo());
		System.out.println("총 제품의 객수 : "+Api_제품생산.countprd);	

		
		
		
		
	}

}
