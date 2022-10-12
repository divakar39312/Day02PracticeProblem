package com.Bridgelabz;

public class arithmaticOperation {
	public static void main(String[] args) {
		
//		i) a+b*c ii) c+a/b
//	   iii) a%b+c iV) a*b+c
		int a=10;
		int b=20;
		int c=30;
		int a1=a+b*c;
		int b1=c+a/b;
		int c1=a%b+c;
		int d1=a*b+c;
		
		if(a1>b1 &&a1>c1 &&a1>d1) {
			System.out.println("max"+a1);
		}
		else if(a1<b1 && a1<c1 && a1<d1) {
			System.out.println(a1);
		}
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		
		
		
		
	}

}
