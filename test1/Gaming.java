package test1;

import java.util.Scanner;
public class Gaming {
 public static void main(String[] args) {
	 
 
	 
	 Scanner sc=new Scanner(System.in);
	 int num=0;
	 while(true) {
	 System.out.println("Enter the number");
	 System.out.println("1. Call of Warfare - ₹1500\n"+"2. Speed Racers - ₹1200\n"+"3. Mystery Mansion - ₹1000\n"+"4. Pixel Adventure - ₹800\n"+"5. Puzzle Mania - ₹500\n"+"6. Checkout / Exit\n");
	  num=sc.nextInt();
	  
	  switch(num) {
		case 1:{
			System.out.println("How many copies you'd like to purchase");
			int quantity1=sc.nextInt();
			System.out.println("Game(s) added to your cart!");
			break;
		}
		case 2:{
			System.out.println("How many copies you'd like to purchase");
			int quantity2=sc.nextInt();
			System.out.println("Game(s) added to your cart!");
			break;
		}
		case 3:{
			System.out.println("How many copies you'd like to purchase");
			int quantity3=sc.nextInt();
			System.out.println("Game(s) added to your cart!");
			break;
		}
		case 4:{
			System.out.println("How many copies you'd like to purchase");
			int quantity4=sc.nextInt();
			System.out.println("Game(s) added to your cart!");
			break;
		}
		case 5:{
			System.out.println("How many copies you'd like to purchase");
			int quantity5=sc.nextInt();
			System.out.println("Game(s) added to your cart!");
			break;
		}
		}
	
	  if(num==6) {
			 System.out.println("Exiting........");
			 System.exit(0);
		 }
		 else if (num < 1 || num >6) {
			
			System.out.println("Invalide number");
			System.out.println("                                      ");
			continue;
		}
	
}
	
}

	
}
		 
	 
	

