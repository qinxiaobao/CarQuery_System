package com.song.test;

public abstract class Car {
	//��Ա����
	private String name;
	private String color;
	
	//����set get����
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
	
	//������
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	//����һ�����󷽷�,����Ҫʵ��
    public abstract String seatNum();
	

}
