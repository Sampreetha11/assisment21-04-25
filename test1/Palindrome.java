package test1;

public class Palindrome {
 public static void main(String[] args) {
	
	 int number=3983;
		int num=number;
		int reverse=0;
		
		while(number!=0) {
			int paslindrome=number%10;
			reverse=reverse*10+paslindrome;
			number=number/10;
		}
		if(reverse==num) {
			System.out.println("palindrome");
		}
	else {
		System.out.println("not palindrome");
	}
}
}
