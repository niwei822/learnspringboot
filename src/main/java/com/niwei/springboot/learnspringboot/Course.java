package com.niwei.springboot.learnspringboot;

public class Course {
	private int id;
	private String name;
	private String atuhor;

	public Course(int id, String name, String atuhor) {
		super();
		this.id = id;
		this.name = name;
		this.atuhor = atuhor;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAtuhor() {
		return atuhor;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", atuhor=" + atuhor + "]";
	}
	
	
}
