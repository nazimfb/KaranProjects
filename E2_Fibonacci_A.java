package KaranProjects;

import java.util.ArrayList;
import java.util.Scanner;

public class E2_Fibonacci_A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of fibonaci sequence: ");
		int myNum = sc.nextInt();
		sc.close();
		ArrayList<Integer> fibonaciList = new ArrayList<Integer>(); 
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		fibonaciList.add(n1,n2);
		
		for (int i = 1; i<=myNum; ++i) {
			if (myNum>0) {
				n3 = n1 + n2;
				// bu hisseni yazsaq bu edede qeder hesablayir.
				if (n3 > myNum) {
					break;
				}
				fibonaciList.add(n3);
				n1=n2;
				n2=n3;
			}
		}
		
		System.out.println("Sequence List = " + fibonaciList);
	} 
}
