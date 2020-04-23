package com.song.test;

import java.util.Scanner;

public class Test {
	private static Scanner scanner;
	private static Sedan   sedan;
	private static Bus bus;
	private static Truck truck;
	private static Car[] cars;
	
	//�ھ�̬�������ʵ��������
	static {
		scanner = new Scanner(System.in);
		sedan = new Sedan("С�γ�","��ɫ");
		bus = new Bus("��ͳ�","��ɫ");
		truck = new Truck("����","��ɫ",2);
		//ʵ����Car����
		cars = new Car[3];
		cars[0] = sedan;
		cars[1] = bus;
		cars[2] = truck;
		
	}
    
	
	public void showCars() {
		System.out.println("��ӭʹ�ñ���������ϵͳ");
		System.out.println("��������\t\t������ɫ\t\t��λ��\t\t������");
		for(Car car:cars) {
			if(car instanceof Truck) {
				Truck truck = (Truck)car;
			    System.out.println(car.getName()+"\t\t"+car.getColor()+"\t\t"+car.seatNum()+"\t\t"+truck.getweight());
			}else {
				System.out.println(car.getName()+"\t\t"+car.getColor()+"\t\t"+car.seatNum()+"\t\t��������");
			}
		}
		System.out.println("1.С�γ�\t2.��ͳ�\t3.����");
		System.out.println("��ѡ��Ҫ�޸ĵĳ���");
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
		    	System.out.println("����������!");
		    	break;
		
		}
		
	}
	
	//������װһ�������޸ķ���
	public void update(String type){
		String name = null;
		String color = null;
		if(type.equals("sedan")) {
			System.out.println("�����복�����ƣ�");
			name = scanner.next();
			System.out.println("�����복����ɫ��");
			color = scanner.next();
			Sedan sedan = new Sedan(name,color);
			cars[0] = sedan;
		}
		if(type.equals("bus")) {
			System.out.println("�����복�����ƣ�");
			name = scanner.next();
			System.out.println("�����복����ɫ��");
			color = scanner.next();
			Bus bus = new Bus(name,color);
			cars[1] = bus;
		}
		if(type.equals("truck")) {
			System.out.println("�����복�����ƣ�");
			name = scanner.next();
			System.out.println("�����복����ɫ��");
			color = scanner.next();
			System.out.println("��������������");
			int weight = scanner.nextInt();
			if(weight > 12) {
				CarException carException = new CarException("���������������ܳ���12�֣�");
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
