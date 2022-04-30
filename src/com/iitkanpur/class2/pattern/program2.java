package com.iitkanpur.class2.pattern;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte count=15;
		for (int i =5; i>=1; i--) { 				// no of row = 5
			for (int j = 1; j<=i; j++) {			// no of columns = i's current value
				if (count <= 9){
					System.out.print("0"+count);
					System.out.print("  ");
				}
				else {
				System.out.print(count);
				System.out.print("  ");
				}
				count--;
			}
			System.out.println();					// move to next row
			
		}
		
	}

}
