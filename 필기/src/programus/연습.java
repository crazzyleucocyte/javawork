package programus;


public class 연습 {

	public static void main(String[] args) {
//		//valueOf
//		
//	int a = 13;
//	String str="";
//	str+=String.valueOf(a);
//	System.out.println(str);
//	int b = 384;
//	str+=String.valueOf(b);
//	System.out.println(str);
//		
//		System.out.println(Math.max(a, b));
//		Solution2 s = new Solution2();
//		System.out.println( s.solution("afghtf"));
//		
	}

	private static char[] isOdd(int a) {
		// TODO Auto-generated method stub
		return null;
	}

}
class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode =false;
        int i=0;
        
       for(char cod : code.toCharArray()) {
    	   if(cod==1) mode=!mode;
    	   else if(i%2==0) answer=(mode)? answer.valueOf(""): answer+cod;
    	   else answer = mode? answer.valueOf(cod) : answer.valueOf("");
    	   i++;
       }
       return answer;
        } 
        
    }

class Solution1 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        switch(ineq+eq){
        case ">=": return n>=m ? 1:0;
        case "<=": return n<=m ? 1:0;
        case ">!": return n>m ? 1:0;
        case "<!": return n<m ? 1:0;
        default: return 0;
            
    }
    }
}

class Solution3 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char str[]= my_string.toCharArray();
        for(int i=0;i<str.length;i++){
            if(Character.isUpperCase(str[i])){
                answer[str[i]-65]+=1;
            }else{
                answer[str[i]-71]+=1;
            }
            
            
        }
        return answer;
        
    }
}

class nothing{
	int a = 12;
	int b=3;
	
	
	
	
	
	
	
}
