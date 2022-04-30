package com.iitkanpur.class2.pattern;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 5; i++) {
			for(int j =1; j<=5; j++) {
				// to print the "#"s 
				if(i==1||i==5||j==1||j==3||j==5) {
					System.out.print("#" + " ");
				}
				// to print the spaces
				else {
					System.out.print(" "+" ");
				}
			}
			// to goto the next line 
			System.out.println();
		}

	}

}
