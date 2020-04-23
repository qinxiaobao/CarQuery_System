package com.song.test;

public abstract class Car {
	//成员变量
	private String name;
	private String color;
	
	//生成set get方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//构造器
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	//定义一个抽象方法,不需要实现
    public abstract String seatNum();
	

}
