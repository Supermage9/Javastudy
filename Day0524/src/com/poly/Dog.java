package com.poly;

public class Dog extends Animal{
	
	private String name;
	
	public Dog() {
		name = getClass().getSimpleName();
	}
	
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "¸Û¸Û";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
