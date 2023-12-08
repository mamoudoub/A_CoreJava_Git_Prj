import java.util.Scanner;

import SimpleClasses.Driver;

public class Main {
	    Driver dr = new Driver();
	    
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the first number,  a: ");
			int a = sc.nextInt();
			
			System.out.print("Enter the second number, b: ");
			int b = sc.nextInt();
			
			System.out.print("Enter the third number,  c: ");
			int c = sc.nextInt();
			
			//dr.multiple10(sc);
			//dr.GCD(10, 9);
			//dr.double d = listAverage();
			//dr.minNumList();
			// boolean a = dr.isPrime(38);
			//dr.isPalindrome("never odd or even");
			//dr.isPalindrome("no even");
			
			System.out.printf("a = %d\nb = %d\nc = %d\n", a, b, c);
			System.out.printf("%d + %d + %d = %d\n", a, b, c, (a + b + c));
			System.out.printf("Reminder of b and a is %d\n", (c % a));
			System.out.printf("Reminder of d and c is %d\n",  (c % b));
			System.out.printf("Reminder of b+d and a+c is %d\n", (c*c % a*b));
		}
}