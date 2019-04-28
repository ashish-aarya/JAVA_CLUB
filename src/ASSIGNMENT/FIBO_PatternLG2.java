package ASSIGNMENT;

import java.util.Scanner;

public class FIBO_PatternLG2 {
public static void main(String[] args) {
						// TODO Auto-generated method stub
				int n;
				System.out.println("Enter the term");
				Scanner s = new Scanner(System.in);
				n = s.nextInt();
				int sum = 0, a = 0, b = 1;
				//System.out.print(a + "\n" + b + " ");
				for (int j=1;j<=n;j++)
				{
				for (int i=1; i<=j; i++) {
					
					
					System.out.print(a+ " ");
					sum = a + b;
					a = b;
					b = sum;
					
					
				}
				System.out.println("");
				}
				
				}
			
	}


