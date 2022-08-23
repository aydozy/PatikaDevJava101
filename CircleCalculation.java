package AreaAndPerimeterOfCircle;

import java.util.Scanner;

public class CircleCalculation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter a radius of the circle : ");
		double radius = sc.nextDouble();

		double area = Math.PI * Math.pow(radius, radius);
		double perimeter = 2 * Math.PI * radius;

		System.out.println("Area : " + area);
		System.out.println("Perimeter: " + perimeter);

		/* central angle: alpha */
		System.out.print("Enter an angle: ");
		double angle = sc.nextDouble();
		double areaWithAngle = (Math.PI * Math.pow(radius, radius) * angle) / 360;
		System.out.println("Area with an angle: " + areaWithAngle);

	}

}
