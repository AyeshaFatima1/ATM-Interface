package com.java;

import java.util.*;

//create ATM Example class to implement the ATM functionality
public class ATM {

	public static void main(String[] args) {
		//declare and initialize balance, withdraw, and deposit  
        int balance = 0, withdraw, deposit;  
          
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("ATM Machine\n");
            System.out.println("choose 1 for PinNumber");
            System.out.println("Choose 2 for Withdraw");  
            System.out.println("Choose 3 for Deposit");  
            System.out.println("Choose 4 for Check Balance");  
            System.out.println("Choose 5 for EXIT\n");  
            System.out.print("Choose the operation:");  
              
            //get choice from user  
            int choice = sc.nextInt();  
            switch(choice)  
            {
            case 1:
            	System.out.println("Enter PinNumber:");
            	int PinNumber = sc.nextInt();
           
            	if(PinNumber<10000) {
            	System.out.println("your pin is valid");
            	}
            	else {
            		System.out.println("Invalid PinNumber");
            	}
            	break;
            case 2:  
    System.out.print("Enter money to be withdrawn:");  
                  
    //get the withdrawl money from user  
    withdraw = sc.nextInt();  
                  
    //check whether the balance is greater than or equal to the withdrawal amount  
    if(balance >= withdraw)  
    {  
        //remove the withdrawl amount from the total balance  
        balance = balance - withdraw;  
        System.out.println("Please collect your money");  
    }  
    else  
    {  
        //show custom error message   
        System.out.println("Insufficient Balance");  
    }  
    System.out.println("");  
    break; 
            case 3:  
                
                System.out.print("Enter money to be deposited:");  
                              
                //get deposite amount from te user  
                deposit = sc.nextInt();  
                              
                //add the deposit amount to the total balanace  
                balance = balance + deposit;  
                System.out.println("Your Money has been successfully deposited");  
                System.out.println("");  
                break;  
           
                        case 4:  
                //displaying the total balance of the user  
                System.out.println("Balance : "+balance);  
                System.out.println("");  
                break;  
           
                        case 5:  
                //exit from the menu  
                System.exit(0);  
                  }  
                }  
              }
			}

