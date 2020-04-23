package com.song.test;

public class Truck extends Car implements Container{

	
	private int weight;
	
	public Truck(String name, String color,int weight) {
		super(name, color);
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}
	
	public String seatNum() {
		return "2×ùÎ»";
	}

	@Override
	public int getweight() {
		// TODO Auto-generated method stub
		return this.weight;
	}
      
}
 