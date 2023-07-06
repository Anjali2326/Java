package demo;

import java.util.Scanner;

public class Sub {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value");
		a=sc.nextInt();
		System.out.println("Enter second value");
		b=sc.nextInt();
		a=a-b;
	    System.out.println("Total sum of "+a);
	}

}
