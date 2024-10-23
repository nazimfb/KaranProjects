package KaranProjects;

import java.util.Scanner;

public class E3_Prime_Factorization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String exit_text = sc.next();
		
		while (exit_text!=null && !exit_text.equals("exit")) {
			System.out.println("Enter a number ::");
			int number = sc.nextInt();
			sc.close();
			
			for(int i = 2; i< number; i++) {
				while(number%i == 0) {
					System.out.println(i+" ");
					number = number/i;
				}
			}
			if(number >2) {
				System.out.println(number);
			}
		}
	}
	
}
