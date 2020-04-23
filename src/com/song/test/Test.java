package com.song.test;

import java.util.Scanner;

public class Test {
	private static Scanner scanner;
	private static Sedan   sedan;
	private static Bus bus;
	private static Truck truck;
	private static Car[] cars;
	
	//在静态代码块中实例化对象
	static {
		scanner = new Scanner(System.in);
		sedan = new Sedan("小轿车","黑色");
		bus = new Bus("大巴车","绿色");
		truck = new Truck("卡车","蓝色",2);
		//实例化Car数组
		cars = new Car[3];
		cars[0] = sedan;
		cars[1] = bus;
		cars[2] = truck;
		
	}
    
	
	public void showCars() {
		System.out.println("欢迎使用本汽车管理系统");
		System.out.println("车辆名称\t\t车辆颜色\t\t座位数\t\t载重数");
		for(Car car:cars) {
			if(car instanceof Truck) {
				Truck truck = (Truck)car;
			    System.out.println(car.getName()+"\t\t"+car.getColor()+"\t\t"+car.seatNum()+"\t\t"+truck.getweight());
			}else {
				System.out.println(car.getName()+"\t\t"+car.getColor()+"\t\t"+car.seatNum()+"\t\t不能拉货");
			}
		}
		System.out.println("1.小轿车\t2.大巴车\t3.卡车");
		System.out.println("请选择要修改的车辆");
		int num = scanner.nextInt();
		switch(num) {
		    case 1:
		    	 update("sedan");
			     break;
		    case 2:
		    	 update("bus");
		    	 break;
		    case 3:
		    	update("truck");
		    	 break;
		    	 
		    default:
		    	System.out.println("车辆不存在!");
		    	break;
		
		}
		
	}
	
	//单独封装一个车辆修改方法
	public void update(String type){
		String name = null;
		String color = null;
		if(type.equals("sedan")) {
			System.out.println("请输入车辆名称：");
			name = scanner.next();
			System.out.println("请输入车辆颜色：");
			color = scanner.next();
			Sedan sedan = new Sedan(name,color);
			cars[0] = sedan;
		}
		if(type.equals("bus")) {
			System.out.println("请输入车辆名称：");
			name = scanner.next();
			System.out.println("请输入车辆颜色：");
			color = scanner.next();
			Bus bus = new Bus(name,color);
			cars[1] = bus;
		}
		if(type.equals("truck")) {
			System.out.println("请输入车辆名称：");
			name = scanner.next();
			System.out.println("请输入车辆颜色：");
			color = scanner.next();
			System.out.println("请输入载重量：");
			int weight = scanner.nextInt();
			if(weight > 12) {
				CarException carException = new CarException("卡车的载重量不能超过12吨！");
				try {
				   throw carException;
			    }catch(CarException e) {
			    	e.printStackTrace();
			    	return;
			    }
			}
			Truck truck = new Truck(name,color,weight);
			cars[2] = truck;
		}
		showCars();
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.showCars();
	}
}
