package com.iitkanpur.weekend2;

import java.util.Scanner;

class Calculate{
    void operations() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num-1");
        double num1 = sc.nextDouble();
        System.out.println("enter the num-1");
        double num2 = sc.nextDouble();
        
        System.out.println("Please select the opearation to be performed\n"
                + "1. Addition\n"
                + "2. subtraction\n"
                + "3. multiplication\n"
                + "4. division\n"
                + "5. exit");
        int n = sc.nextInt();
        
        // used prinf() to roundoff the result using formatting output
        if(n==1) {
            double addition = num1+num2;
            System.out.printf("The addition result is: \n "+num1+"+"+num2+" = "+"%.2f"+"\n",addition);
        }
        else if(n==2) {
            double subtraction = num1-num2;
            System.out.printf("The subtraction result is: \n "+num1+"-"+num2+" = "+"%.2f"+"\n",subtraction);
        }
        else if(n==3) {
            double multiplication = num1*num2;
            System.out.printf("The multiplication result is: \n "+num1+"x"+num2+" = "+"%.2f"+"\n",multiplication);
        }
        else if(n==4) {
            double division = num1/num2;
            System.out.printf("The Division result is: \n"+num1+"/"+num2+" = " +"%.2f"+"\n",division);
        }
        
        else {
            System.exit(0);
            sc.close();
        }
    }
}
public class Calculator {
    public static void main(String[] args) {
        
        Calculate c = new Calculate();
        for(; ;) //infinite loop
        {
            c.operations();
        }
        
    }
}