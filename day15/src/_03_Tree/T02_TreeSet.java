package _03_Tree;

import java.text.DecimalFormat;
import java.util.*;

public class T02_TreeSet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TreeSet ts = new TreeSet();
		TreeSet lotto = new TreeSet();
		
		int countfirst=0;
		int countsecond=0;
		long money;
		int lottoCount=1;
		
		DecimalFormat dcf=new DecimalFormat("#,###");
		
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println("이번주 로또 번호는 \n"+lotto+"입니다!");
		
//		while(true) {

			System.out.println("로또를 얼마치 구매하실 건가요?");
			money=s.nextInt();
//			money=Long.MAX_VALUE;
			
//			if(money%1000==0) break;
//			else {
//				System.out.println("천 원단위로 입력해주세요.");
//				continue;
//			}
//		}
		for(int i=0;i<money;i++) {
			if(i%5==0) {
				System.out.println(lottoCount+++" 번째 장\n----------------------");
			}
			
			while(ts.size()<6) {
				ts.add((int)(Math.random()*45)+1);
			}
			//얘는 자동 내림차순 정렬임
			System.out.println(ts);
			ts.retainAll(lotto);
			if(ts.size()==5) {
				System.out.println("축하합니다 2등 당첨입니다"+ ++countsecond);
				System.out.println("로또 번호는 "+lotto+"입니다");
				System.out.println(ts);
			}else if(ts.size()==6) {
				System.out.println("축하합니다 1등 당첨입니다!!!!!!!!!!!"+ ++countfirst);
			}
			
			ts.clear();
			if((i+1)%5==0&&i!=0) System.out.println("----------------------\n");
			
			
		}
		System.out.println(lotto);
System.out.println("1등 당첨 횟수 : "+countfirst+"\n2등 당첨 횟수 : "+countsecond+"\n구매한 금액 : "+dcf.format(money*1000L)+"원");
	System.out.println("1등 당첨 금액(세후)은 : "+dcf.format(countfirst*2043970000L*0.67)+"원\n2등 당첨 금액(세후)은 : "+dcf.format(countsecond*73000000L*0.78)+"원 입니다.");
	System.out.println("로또를 구매하고 난 순이익은 : "+dcf.format((countfirst*2043970000L*0.67)+(countsecond*73000000L*0.78)-(money*1000L))+"원 입니다.");
	}

}
