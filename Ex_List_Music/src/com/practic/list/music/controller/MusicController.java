package com.practic.list.music.controller;

import java.util.*;

import com.practic.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list =new ArrayList();
//-------------------------------------------------
//	리스트 마지막에 값 저장 메소드
	public int addList(Music music) {
		try {
		list.add(music);
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		return 1;//??? 왜 1인가?
	}
//-------------------------------------------------	
//	리스트 첫 번째에 값 저장 메소드
	public int addAtZero(Music music) {//
		try {
			list.add(0,music);
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		return 1;//??? 왜 1인가?
	}
//-------------------------------------------------	
//	모든 리스트를 반환하는 메소드
	public List printAll() {
		return list;
	}
//-------------------------------------------------	
//	곡 명을 검색하는 메소드
	Music searchMusic(String title) {
		list.contains()
		return
	}

	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("sgsdgg");
		list.add("sgsdgsg");
		System.out.println(list);
	}
	
}
