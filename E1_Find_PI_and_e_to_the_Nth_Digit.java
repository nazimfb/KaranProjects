package KaranProjects;
import java.util.ArrayList;
import java.util.Scanner;

public class E1_Find_PI_and_e_to_the_Nth_Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextShort();
		sc.close();
		piToDigit(num);
	}
	
	static void piToDigit(int num) {
		ArrayList<Double> list = new ArrayList<Double>();
		for (int i =0; i<=num; i++) {
			double result = Math.PI * i;
			list.add(result);
		}
		System.out.println("List = " + list);
	}
}