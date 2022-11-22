package com.masai.model;

public class StudentDTO {

	private String name;
	
	private Integer marks;
	
	public StudentDTO() {
		
	}

	public StudentDTO(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	
	
	
	
}
