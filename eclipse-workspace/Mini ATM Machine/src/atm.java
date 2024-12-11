

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		 
		int pin = 2356;
		int balance = 5000 ;
		
		int addmoney =0;
		int withdrew = 0;

		String name;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("enter your pin number");
		int password = scan.nextInt();
		if (password == pin) {
			
			System.out.println("Hi! Welcome ");
			while (true) {
				System.out.println("press 1 to Check Balance");
				System.out.println("press 2 to Add Money");
				System.out.println("press 3 to Withdrew");
				System.out.println("press 4 for Receipt");
				System.out.println("press 5 for EXIT");
				
				int num = scan.nextInt();
				switch (num) {
				case 1:
					System.out.println("Your Balance ="+ balance);
					break;
				case 2 :
					System.out.println("Enter Amount to Add");
					 addmoney = scan.nextInt();
					 System.out.println("Successfully Credited");
					 balance= addmoney+balance;
					 break;
				case 3 :
					System.out.println("Enter The Amount To Withdrew");
					withdrew = scan.nextInt();
					if (withdrew > balance) {
						System.out.println("Insufficent Balance");
						System.out.println("try with another amount");
					}else {
						System.out.println("Amount Taken ");
						balance=balance-withdrew;
					}
					break;
				case 4:
					System.out.println("WELCOME TO OUR ATM");
					System.out.println("Your Balance is ="+balance);
					System.out.println("Amount Deposited="+addmoney);
					System.out.println("Amount Taken ="+withdrew);
					System.out.println("Thanks For Using Us");
					
				}
				if (num==5) {
					System.out.println("Thanks Come Again");
					break;
				}
			}
		}else {
			System.out.println("Wrong Pin ");
			System.out.println("Enter The Correct Pin");
		}
		
	}

}
