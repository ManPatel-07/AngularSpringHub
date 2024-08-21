package corejava;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first no :-");
		int no1 = sc.nextInt();
		
		System.out.println("Enter Second No :- ");
		int no2 = sc.nextInt();
		
		int add = no1 + no2;
		System.out.println("Addition Of 2 number is :- " + add);

	}

}
