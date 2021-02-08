package com.src;

import java.util.Scanner;
public class TeEx {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("enter a data");

int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println((a>b && a>c)?a:(b>a && b>c)?b:c);

	}

}