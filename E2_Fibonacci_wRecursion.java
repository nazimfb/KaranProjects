package KaranProjects;

import java.util.Scanner;

public class E2_Fibonacci_wRecursion {
	static int n1=0,n2=1,n3=0;    

	 
	 static void printFibonacci(int count){    
		    if(count>0){
		    	// rekursiya menfiye dogru sonsuz getmesin deye shert qoyuruq
		         n3 = n1 + n2;    
		         n1 = n2;    
		         n2 = n3;    
		         System.out.print(" "+n3);   
		         printFibonacci(count-1);    
		     }    
		 }    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of fibonaci sequence: ");
		
		int myNum = sc.nextInt();
		sc.close();
		
		System.out.print(0 + " ");
		System.out.print(1);
		
		printFibonacci(myNum);
		
	}
}
