package shapes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws ParallelogramException {

		Shape shapes[] = new Shape[32];
		int count = 0;
		
		System.out.println("------->JAC 444 Assignment 2 & 3<-------");
		System.out.println("------->Task 1 ... <-------");

		try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
			
			String s;
			while ((s = br.readLine()) != null) {
				
				String[] params = s.split(",");

				if (params[0].equals("Circle") && params.length == 2) {
					try {
						shapes[count] = new Circle(Double.parseDouble(params[1]));
						count++;
					} catch (Exception e) {
						System.out.println("Invalid radius!");
					}
				}
				
				else if (params[0].equals("Square") && params.length == 2) {
					try {
						shapes[count] = new Square(Double.parseDouble(params[1]));
						count++;
					} catch (Exception e) {
						System.out.println("Invalid side!");
					}
				}
				
				else if (params[0].equals("Rectangle") && params.length == 3) {
					try {
						shapes[count] = new Rectangle(Double.parseDouble(params[1]), Double.parseDouble(params[2]));
						count++;
					} catch (Exception e) {
						System.out.println("Invalid side(s)!");
					}
				}
				
				else if (params[0].equals("Parallelogram") && params.length == 3) {
					try {
						shapes[count] = new Parallelogram(Double.parseDouble(params[1]), Double.parseDouble(params[2]));
						count++;
					} catch (Exception e) {
						System.out.println("Invalid side(s)!");
					}
				}
				
				else if (params[0].equals("Triangle") && params.length == 4) {
					try {
						shapes[count] = new Triangle(Double.parseDouble(params[1]), Double.parseDouble(params[2]), Double.parseDouble(params[3]));
						count++;
					} catch (Exception e) {
						System.out.println("Invalid side(s)!");
					}
				}
				
				
				
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		double smallestTriangle = Double.POSITIVE_INFINITY;
		double largestCircle = 0;
		
		System.out.println("\n" + count + " shapes were created:");
		for (int i = 0; i < count; i++) {
			System.out.println(shapes[i] + "\n");
			
			if (shapes[i].getClass().getSimpleName().contentEquals("Triangle")) {
				if (shapes[i].perimeter() < smallestTriangle) {
					smallestTriangle = shapes[i].perimeter();
				}
			}
			
			if (shapes[i].getClass().getSimpleName().contentEquals("Circle")) {
				if (shapes[i].perimeter() > largestCircle) {
					largestCircle = shapes[i].perimeter();
				}
			}
		}
		
		System.out.println("------->Task 2 ... <-------");
		
		double triangleTotalPerimeter = 0;
		double parallelogramTotalPerimeter = 0;
		
		for (int i = 0; i < count; i++) {
			if (shapes[i].getClass().getSimpleName().contentEquals("Triangle")) {
				if (shapes[i].perimeter() > smallestTriangle) {
					System.out.println(shapes[i] + "\n");		
					triangleTotalPerimeter += shapes[i].perimeter();
				}
			}
			else if (shapes[i].getClass().getSimpleName().contentEquals("Circle")) {
				if (shapes[i].perimeter() < largestCircle) {
					System.out.println(shapes[i] + "\n");									
				}
			}
			else if (shapes[i].getClass().getSimpleName().contentEquals("Parallelogram")) {
				parallelogramTotalPerimeter += shapes[i].perimeter();
				System.out.println(shapes[i] + "\n");
			}
			else {
				System.out.println(shapes[i] + "\n");
			}
		}
		
		System.out.println("------->Task 3 ... <-------");
		System.out.println("Total perimeter of Parallelogram is: " + parallelogramTotalPerimeter);
		System.out.println("Total perimeter of Triangle is: " + triangleTotalPerimeter);
	}
}