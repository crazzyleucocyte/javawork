package _02_variable;

public class T04_String {

	public static void main(String[] args) {

		//이스케이프 문자 및 String 사용
		String str1 = "801호";
		String str2 = "\"의료용 디지털 영상 표준 활용\"";// 이스케이프 문자/"사용
		System.out.println(str1+" "+str2);//출력 결과 띄어쓰기를 하려면"를 사용해야 한다
		System.out.println(str2);
		
		//escape sequence(이스케이프 문자)
		/*
		 * 글꼴에 따라 /가 나오거나 원 표시가 나올 수 있다.
		 * \ + 문자  조합으로 특수 기능 수행
		 \n : 줄 바꿈
		 \t : 탭만큼 띄어쓰기
		 \" : 쌍따옴표 출력
		 \ :뒤에 특별한게 오니깐 그대로 출력해라
		 \\:역슬래시 출력
		 */
		System.out.println("강의실 : 801호\n강좌명 : "+str2);// 엔터 이스케이프 문자\n 사용
		System.out.println("강의실 : 801호\t강좌명 : "+str2);// 탭 이스케이프 문자 \t 사용
		
		/*
		 * 강의실 : "801호" 
		 * 강좌명 : "의료용 디지털 영상 표준활용"
		 위와 같이 출력하기 위해 아래의 코드 작성
		 */		
		System.out.println("\n강의실 : \"801호\"\n강좌명 : \"의료용 디지털 영상 표준활용\"");

	}

}
