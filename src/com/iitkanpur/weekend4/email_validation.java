package com.iitkanpur.weekend4;

import java.util.ArrayList;
import java.util.Scanner;

class FindEmail {
	void search() {
		boolean hasNoMatch=true;
		ArrayList<String> empEmail = new ArrayList<String>();
		empEmail.add("malay@gmail.com");
		empEmail.add("rahul@gmail.com");
		empEmail.add("aparna@gmail.com");
		empEmail.add("riya@gmail.com");
		empEmail.add("manas@gmail.com");
		empEmail.add("ankita@gmail.com");
		
		String searchElement;
		System.out.println("Enter the email to be searched: ");
		Scanner sc = new Scanner(System.in);
		searchElement = sc.nextLine();
		

		for (String element :empEmail){
			   if (element.contains(searchElement)){
			      System.out.println("the entered email"+"("+searchElement+")"+" has been found in our database!! \n");
			      hasNoMatch=false;
			      break;
			   }
			   		  
			}
		if(hasNoMatch) {
			System.out.println("Sorry!! the entered email not found!! \n");
		}
	
	}
}

public class email_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in);
		int c;
		FindEmail f = new FindEmail();
		do {
			f.search();
			System.out.println(" Want to search for another email? \n 1.yes \n 2.No");
		    c = sc.nextInt();
		}
		while(c==1);
		
		sc.close();
	}

}
