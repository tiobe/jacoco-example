package org.song.example;



public class Student {
	private int id2;
	private String name;
	private int score;
	
	public Student(int id2, String name, int score) {
		this.id2 = id2;
		this.name = name;
		this.score = score;
	}
	
	public int getId() {
		return id2;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
}
