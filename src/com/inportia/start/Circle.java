package com.inportia.start;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result;
		result=area(5);
		System.out.println("Area of circle is : " + result);

	}
	
	static double area(int radius) {
		double A;
		
		A= 3.14*(radius*radius);
				
		return A;
	}

}
