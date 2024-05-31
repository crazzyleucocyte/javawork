package com.practic.list.music.model.compare;

import java.util.Comparator;

import com.practic.list.music.model.vo.Music;

public class AscTitle implements Comparator<Object> {

	public int compare(Object o1, Object o2) {
		Music music1 = (Music) o1;
		Music music2 = (Music) o2;
		if (music1.getTitle().compareTo(music2.getTitle()) > 0) {
			return 1;
		} else if (music1.getTitle().compareTo(music2.getTitle()) < 0) {
			return -1;
		} else {
			return music1.getSinger().compareTo(music2.getSinger());
		}
	}
}
