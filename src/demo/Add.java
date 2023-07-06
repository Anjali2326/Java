package demo;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value");
		a=sc.nextInt();
		System.out.println("Enter second value");
		b=sc.nextInt();
		System.out.println("Enter third value");
		c=sc.nextInt();
		c=a+b+c;
		System.out.println("Total sum of "+c);
		
	}

}
