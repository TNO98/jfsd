package com.iitkanpur.class2.pattern;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte count=1;
		for (int i =1; i<=5; i++) {
			for (int j = 1; j<=i; j++) {
				if (count <= 9){
					System.out.print("0"+count);
					System.out.print("  ");
				}
				else {
				System.out.print(count);
				System.out.print("  ");
				}
				count++;
			}
			System.out.println();
			
		}
		
	}

}
