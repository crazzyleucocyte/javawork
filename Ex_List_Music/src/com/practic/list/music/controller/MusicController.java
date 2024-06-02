package com.practic.list.music.controller;

import java.util.*;

import com.practic.list.music.model.compare.AscTitle;
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
	public Music searchMusic(String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title))
				return list.get(i);
		}return null;
	}
//-------------------------------------------------	
//곡 명으로 찾아 삭제하는 메소드
	public Music removeMusic(String title) {
		Music music;
		for(int i =0;i<list.size();i++) {
			if(list.get(i).equals(title)) {
				music = list.get(i);
				list.remove(i);
				return music;
			}
		}return null;
	}
//-------------------------------------------------	
//	곡 명으로 찾아 내을 수정하는 메소드
	public Music setMusic(String title, Music music) {
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.set(i, music);
				return music;
			}
		}return null;
	}
//-------------------------------------------------	
//	곡 명 오름차순 정렬하는 메소드
	public int ascTitle() {
		try {
		list.sort(new AscTitle());
		return 1;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
//-------------------------------------------------	
//	가수 명으로 내림차순 정렬하는 메소드
	public int descSinger() {
		class DescSinger implements Comparator<Object>{

			public int compare(Object o1, Object o2) {

				Music music1 = (Music) o1;
				Music music2 = (Music) o2;
				return music2.getSinger().compareTo(music1.getSinger());
			}
		}
		try {
			list.sort(new DescSinger());
			return 1;
		}catch(Exception e ) {
			e.printStackTrace();
			return 0;
		}
	}
//-------------------------------------------------	
//	곡의 개수를 반환하는 메소드
	public int listSize() {
		return list.size();
	}
	
	
	
	public static void main(String[] args) {
		MusicController mc = new MusicController();
		Music m = new Music();
		mc.addList(new Music("나비야","동요"));
		mc.addList(new Music("1111","2222"));
		mc.addList(new Music("우리의꿈","코요태"));
		mc.addList(new Music("비행기","동요"));
		mc.addList(new Music("비행기","거북이"));
		System.out.println(mc.printAll());
		System.out.println(mc.ascTitle());
		System.out.println(mc.printAll());
		System.out.println(mc.descSinger());
		System.out.println(mc.printAll());
		
		
		
	}
	
}



