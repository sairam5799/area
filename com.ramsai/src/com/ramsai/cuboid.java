package com.ramsai;

public class cuboid {
	import java.util.Scanner;

	class Main {
	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the radius of the circle: ");
	    double radius = input.nextDouble();
	    double area = Math.PI * radius * radius;
	    System.out.println("The area of the circle is " + area);
	  }
	}

}
