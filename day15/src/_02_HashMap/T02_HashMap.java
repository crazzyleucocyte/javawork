package _02_HashMap;
import java.util.*;


public class T02_HashMap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//사용자의 id(키),pw(값)을 hashMap에 저장(데이터 3개)
		Map<String, String> map = new HashMap<String, String>();
		map.put("myId", "1234");
		map.put("myId2","1111");//value의 자료형을 Integer로 하면 맨 앞의 00이 사라진다. 
		map.put("imminseok","4567");
		
		
		//사용자로부터 id와 pw받아서
		
		//1/ id가 없으면 : 입력한 id는 없습니다.
		//get(key)와 pw와 같은지 비교
		System.out.println("Id를 입력해주세요");
		while(true) {
			String inputId=s.next();
			if(map.containsKey(inputId)) {
				System.out.println("Id가 맞았습니다.");
				System.out.println("pw를 입력해주세요");
				while(true) {
					String inputpw=s.next();
					if(map.get(inputId).equals(inputpw)) {
						System.out.println("pw가 맞았습니다.\n종료합니다.");
						break;
					}else {
						System.out.println("pw가 맞지 않았습니다. 다시 입력해주세요.");
					}
				}
				break;
			}else {
				System.out.println("Id가 맞지 않았습니다. 다시 입력해주세요.");
			}
		}
		
//		System.out.println("imminseok가 있는 Id인가?"+map.containsKey("imminseok"));
//		//2. pw가 맞지 않으면 : pw가 맞지 않습니다 다시 수행
//		System.out.println("pw를 입력해주세요");
//		while(true) {
//			String inputpw=s.next();
//			if(map.containsValue(inputpw)) {
//				System.out.println("pw가 맞았습니다.");
//				break;
//			}else {
//				System.out.println("pw가 맞지 않았습니다. 다시 입력해주세요.");
//			}
//		}
		
		
		//3. id와 pw가 맞으면 종료
		
		
		
		
		
	}

}
