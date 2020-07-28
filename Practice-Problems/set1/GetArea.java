package set1;

import java.util.Scanner;

public class GetArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter figure type [Triangle/Rectangle/Square/Circle]: ");
		String type = scan.nextLine();

		switch (type) {
		case "Triangle":
		case "triangle":
			System.out.print("Enter base and height : ");
			float triBase = Helper.getPosFloat();
			float triHeight = Helper.getPosFloat();
			float triArea = (triBase * triHeight) / 2;
			System.out.println("Area of triange ((base * height)/2) : " + triArea);
			break;
		case "Rectangle":
		case "rectangle":
			System.out.print("Enter width and height : ");
			float recWidth = Helper.getPosFloat();
			float recHeight = Helper.getPosFloat();
			float recArea = recWidth * recHeight;
			System.out.println("Area of rectangle (width * height) : " + recArea);
			break;
		case "Square":
		case "square":
			System.out.print("Enter side length : ");
			float sqSide = Helper.getPosFloat();
			float sqArea = sqSide * sqSide;
			System.out.println("Area of square (side * side) : " + sqArea);
			break;
		case "Circle":
		case "circle":
			System.out.print("Enter radius : ");
			float cirRadius = Helper.getPosFloat();
			float cirArea = (float)Math.PI * (cirRadius * cirRadius);
			System.out.println("Area of circle (PI * (radius * radius)) : " + cirArea);
			break;
		default:
			System.out.println("Invalid Choice!");
		}
		scan.close();
	}

}
