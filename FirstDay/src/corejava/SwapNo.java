package corejava;

import java.util.Scanner;

public class SwapNo
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first no :-");
		int no1 = sc.nextInt();
		
		System.out.println("Enter Second No :- ");
		int no2 = sc.nextInt();
		
		int temp = no1;
		no1 = no2;
		no2 = temp;
		System.out.println("After Swap no1 = "+ no1 + " no2 = " + no2);
		
	}
}
