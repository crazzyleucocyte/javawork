package com.practic.list.music.model.vo;

import java.util.Comparator;
import java.util.Objects;

public class Music implements Comparable {

	private String title;
	private String singer;
	
	public Music() {
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "" + title + " - " + singer + "";
	}
	
	

	@Override
	public int compareTo(Object o1) {
			Music music = (Music)o1;
			return music.getTitle().compareTo(this.getTitle());
	}
			
			
			
			
			
		
		
	}
	
	
	


