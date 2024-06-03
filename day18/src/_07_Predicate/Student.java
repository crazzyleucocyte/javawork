package _07_Predicate;

public class Student {
	
	private String name;
	private int eng;
	private int com;
	private String gender;
	
	public Student(String name, String gender, int com) {
		this.name = name;
		this.gender = gender;
		this.com = com;
	}

	public String getName() {
		return name;
	}

	public int getEng() {
		return eng;
	}

	public int getCom() {
		return com;
	}

	public String getGender() {
		return gender;
	}
	
	
	
	
	
	
}
