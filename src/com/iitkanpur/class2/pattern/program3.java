package com.iitkanpur.class2.pattern;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=5;i++) {
			for(int j=1; j<=5; j++) {
				
				if(i%2==0) {				// if remain is zero prints 0 else 1
					System.out.print("0");
					System.out.print(" ");
				}
				else {
					System.out.print("1");
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
