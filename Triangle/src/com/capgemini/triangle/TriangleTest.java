
package com.capgemini.triangle;

import java.util.*;

/**
 * @author Pooja Karnik Program to find if a triangle is right angled, scalene,
 *         isosceles or equilateral
 *
 */
//testing the sides of a triangle to find which category it fits 
public class TriangleTest {

	// taking the sides of a triangle, passing it to the function and printing the
	// type of triangle
	public static void main(String[] args) {

		System.out.println("Enter the 3 sides of the triangle ");
		Scanner scanner = new Scanner(System.in);
		double side1 = scanner.nextDouble();
		double side2 = scanner.nextDouble();
		double side3 = scanner.nextDouble();

		System.out.println("Enter the type of triangle you want - Right/Scalene/Isosceles/Equilateral");
		String type = scanner.next();

		Triangle triangle = new Triangle(side1, side2, side3);

		if (type.equals("Right")) {
			triangle.isRight();
		} else if (type.equals("Scalene")) {
			triangle.isScalene();
		} else if (type.equals("Isosceles")) {
			triangle.isIsosceles();
		} else if (type.equals("Equilateral")) {
			triangle.isEquilateral();
		}

		if (triangle.isRight() == 1) {
			System.out.println("This is a right angled triangle");
		} else {
			System.out.println("This is not a right angled triangle");
		}

		if (triangle.isScalene() == 1) {
			System.out.println("This is a scalene triangle");
		} else {
			System.out.println("This is not a scalene triangle");
		}

		if (triangle.isIsosceles() == 1) {
			System.out.println("This is an isosceles triangle");
		} else {
			System.out.println("This is not an isosceles triangle");
		}

		if (triangle.isEquilateral() == 1) {
			System.out.println("This is an equilateral triangle");
		} else {
			System.out.println("This is not an equilateral triangle");
		}
	}
}
