package KaranProjects;

import java.util.Scanner;

public class E4_find_cost_of_tile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter width of the floor: ");
		float w = sc.nextFloat();
		System.out.print("Enter height of the floor: ");
		float h = sc.nextFloat();
		System.out.print("Enter cost of tile: ");
		float cost = sc.nextFloat();
		sc.close();
		
		System.out.printf("Cost of tile for floor will be: %f", w*h*cost);
	}
}
