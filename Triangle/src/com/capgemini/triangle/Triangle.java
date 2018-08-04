
package com.capgemini.triangle;

//calculating the type of triangle from its sides
public class Triangle {

	private double side1;
	private double side2;
	private double side3;

	// parameterized constructor created
	Triangle(double side1, double side2, double side3) {

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// get the first side
	public double getSide1() {

		return side1;
	}

	// set the first side
	public void setSide1(double side1) {

		this.side1 = side1;
	}

	// get the second side
	public double getSide2() {

		return side2;
	}

	// set the second side
	public void setSide2(double side2) {

		this.side2 = side2;
	}

	// get the third side
	public double getSide3() {

		return side3;
	}

	// set the third side
	public void setSide3(double side3) {

		this.side3 = side3;
	}

	// checking if it is a right angled triangle from the sides given
	int isRight() {

		if (side3 == (Math.sqrt((side1 * side1) + (side2 * side2)))) {
			return 1;
		}
		return 0;
	}

	// checking if it is a scalene triangle from the sides given
	int isScalene() {

		if ((side1 != side2) && (side2 != side3) && (side1 != side3)) {
			return 1;
		}
		return 0;
	}

	// checking if it is a isosceles triangle from the sides given
	int isIsosceles() {

		if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
			return 1;
		}
		return 0;
	}

	// checking if it is an equilateral triangle from the sides given
	int isEquilateral() {

		if ((side1 == side2) && (side2 == side3)) {
			return 1;
		}
		return 0;
	}
}
