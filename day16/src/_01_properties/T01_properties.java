package _01_properties;


//import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class T01_properties {

	public static void main(String[] args) {
		//properties : Map계열 =>키+값 세트 저장
		//HashMap과의 차이 : properties에는 키 = String, 값 = String으로 담는다
		//HashMap은 키와 값의 자료형을 마음대로 설정할 수 있지만 properties는 고정인듯
		
		Properties prop = new Properties();
		
		//Map 계열이므로 자료 저장은 put으로 한다
		//값 추가할 때
		//1. setProperty(String key, String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);//같은 키 값이 들어오면 나중에 들어온 값으로 덮어쓰기 된다
		
		//key를 얻어 올때
		//2. getProperties(String key) : 존재하지 않는 키 일경우 null반환
		System.out.println(prop.getProperty("Set"));
		System.out.println(prop.getProperty("AAA"));
		System.out.println(prop.get("Set"));
		
		
//		try {
//		//네트워크를 통해 어딘가로 보낼떄는 stream을 쓰는데 이 stream은 파일을 하나하나 쪼개서 보내는 방법이다.
//			//아래의 코드는 파일로 내보내기 하는 방법이다
//		prop.store(new FileOutputStream("test.properties"),"propereiesTest");
//		//아래처럼 xml을 더 사용 하는데 이유는 sml은 웹사이트에서도 열 수 있기 때문이다.
//		prop.storeToXML(new FileOutputStream("test.xml"),"propereiesTest");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
	}

}
