package com.iitkanpur.weekend4;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int [][] a1 = new int[2][2];
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.println("Enter the element no:"+(j+1));
                a1[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.println("the element no:"+(j+1)+" is: "+a1[i][j]);
            }
        }
	}

}
