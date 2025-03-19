package Session3;

import java.util.Scanner;

public class Nestedforloop {
	
	public static void main(String[] args) {
		/*for(int s = 1; s<=4; s++) {  //s=1
			for(int j = 1; j<=4; j++) { //j=1 to 4 // 4 times iteration happens
				System.out.print(" "+j);
			}
			System.out.println();
		}*/
		
		//triangle
		
	/*	int num = 6;
		
		for(int i = 0; i<=num; i++) {
			
	
		for(int j = 1; j<=num-i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}*/
		
		//Diamond pattern
		
		Scanner sc = new Scanner(System.in);
		
		//no of rows by users to give for pattern printing
		
		System.out.println("Enter noof rows:");
		
		int rows = sc.nextInt();
		
		// Top half of diamond
		for(int i = 1; i<=rows; i++) {
			//leading space
			for(int j = i; j<rows; j++) {
				  
				System.out.print(" ");
			}
			//print *
			for(int k = 1; k<=(2*i-1); k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	
		
		//Bottom half of diamond
		
		for(int i = rows-1; i>=1; i--) {
			//leading space
			for(int j = rows; j>i; j--) {
				
				System.out.print(" ");
			}
			//print*
			for(int k = 1; k<=(2*i-1);k++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
}
