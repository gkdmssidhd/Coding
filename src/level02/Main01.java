package level02;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A;
		A = scan.nextInt();
		
		if(A >= 90 && A<=100) {
			System.out.println("A");
		} else if(A >= 80 && A <= 89) {
			System.out.println("B");		
		} else if(A >= 70 && A <= 79) {
			System.out.println("C");		
		} else if(A >= 60 && A <= 69) {
			System.out.println("D");		
		} else {
			System.out.println("F");
		}
	}

}
