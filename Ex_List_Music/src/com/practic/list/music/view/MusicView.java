package com.practic.list.music.view;

import java.util.Scanner;

import com.practic.list.music.controller.MusicController;
import com.practic.list.music.model.vo.Music;

public class MusicView {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	String inputTitle;
	String inputSinger;
	boolean checker;

//-------------------------------------------------	
//사용자가 직접 메인 메뉴를 선택 할 수 있음. 종료 전까지 반복실행, 각 메뉴를 누를 시 해당 메소드로 이동.
	public void mainMenu() {
		boolean endCheck = true;
//-------------------------------------------------	
//	while반복문
		while (endCheck) {
			System.out.print("\n******* 메인 메뉴 *******" + 
					"\n1. 마지막 위치에 곡 추가" + 
					"\n2. 첫 위치에 곡 추가" + 
					"\n3. 전체 곡 목록 출력" + 
					"\n4. 특정 곡 검색" + 
					"\n5. 특정 곡 삭제" + 
					"\n6. 특정 곡 정보 수정" + 
					"\n7. 곡명 오름차순 정렬" + 
					"\n8. 가수명 내림차순 정렬" + 
					"\n9. 종료"
					+ "\n\n메뉴 번호 입력");
//-------------------------------------------------	
//		메뉴판
			int menuNum = sc.nextInt();
			sc.nextLine();
			switch (menuNum) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:
				endCheck=false;
				break;
			default:

				break;
			}
		}
	}
//-------------------------------------------------	
//	마지막 위치에 곡 추가 성공을 알리는 메소드
	public void addList() {
		checker = true;
		while (checker) {
			System.out.print("****** 마지막 위치에 곡 추가 ******\n곡 명 : ");
			inputTitle = sc.nextLine();
			System.out.print("가수 명 : ");
			inputSinger = sc.nextLine();

			System.out.println("입력하신 정보가 맞으신가요?\n");
			System.out.println("곡 명 : " + inputTitle + ", 가수명 : " + inputSinger);
			System.out.print("예(Y) or 아니오(N)\nanswer : ");
			
			int answer = yOrN();
			//y인 경우 
			if (answer == 1) {
				//곡을 추가하는 과정에서 성공, 실패 판단 후 성공시 checker를 true로 바꾸어 while  탈출
				int addlist = mc.addList(new Music(inputTitle, inputSinger));
				if (addlist == 1) {
					checker = false;
					System.out.println("추가 성공");
				} else
					System.out.println("추가하는 과정에서 오류가 발생하여 추가 실패했습니다.");
				//n를 선택한 경
			} else if (answer == -1) {
				System.out.println("다시 입력해주세요.");
				//y나 n가 아닌 다른것을 입력한 경우
			} else
				System.out.println("(예/아니오),(y/n)만 입력해주세요.");

		}
	}
//-------------------------------------------------	
//	첫 위치에 곡 추가 성공을 알리게하는 메소드
	public void addAtZero() {
		checker = true;
		while (checker) {
			System.out.print("****** 첫 위치에 곡 추가 ******\n곡 명 : ");
			inputTitle = sc.nextLine();
			System.out.print("가수 명 : ");
			inputSinger = sc.nextLine();

			System.out.println("입력하신 정보가 맞으신가요?\n");
			System.out.println("곡 명 : " + inputTitle + "가수명 : " + inputSinger);
			System.out.print("예(Y) or 아니오(N)\nanswer : ");
			
			int answer = yOrN();
			//y인 경우 
			if (answer == 1) {
				//곡을 추가하는 과정에서 성공, 실패 판단 후 성공시 checker를 true로 바꾸어 while  탈출
				int addlist = mc.addList(new Music(inputTitle, inputSinger));
				if (addlist == 1) {
					checker = false;
					System.out.println("추가 성공");
				} else
					System.out.println("추가하는 과정에서 오류가 발생하여 추가 실패했습니다.");
				//n를 선택한 경우
			} else if (answer == -1) {
				System.out.println("다시 입력해주세요.");
				//y나 n가 아닌 다른것을 입력한 경우
			} else
				System.out.println("(예/아니오),(y/n)만 입력해주세요.");

		}
	}
//-------------------------------------------------	
//	전체 곡 목록을 출력 성공을 알리는 메소드
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		System.out.println(mc.printAll());
		
	}
//-------------------------------------------------	
//	특정 곡 검색의 결과를 보여주는 메소드 
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		if(mc.listSize() == 0) {
			System.out.println("곡이 존재하지 않습니다.\n곡을 추가해주세요.");
		return;
		}
		System.out.print("곡 명 : ");
		inputTitle = sc.nextLine();
		Music music = mc.searchMusic(inputTitle);
		if(music == null)
			System.out.println("존재하지 않는 곡입니다.");
		else
			System.out.println(music);
		
	}
//-------------------------------------------------	
//	특정 곡 삭제 결과를 보여주는 메소드
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
	}
//-------------------------------------------------	
//	특정 곡 정보 수정 결과를 보여주는 메소드
	public void setMusic() {
		
	}
//-------------------------------------------------	
//	곡 명 오름차순 결과 성공을 알리는 메소드
	public void ascTitle() {
		
	}
//-------------------------------------------------	
//	곡 명 내림차순 결과 성공을 알리는 메소드
	public void descSinger() {
		
	}
//-------------------------------------------------	
//	입력한 정보가 맞는지 물어보는 메소드
	public int yOrN() {
		String yorn = sc.next();
		if(yorn.equals("y")||yorn.equals("Y")||yorn.equals("yes")||yorn.equals("예"))
			return 1;
		else if(yorn.equals("n")||yorn.equals("N")||yorn.equals("no")||yorn.equals("아니오"))
			return -1;
		else
			return 0;
			
	}
	
	
	

}
