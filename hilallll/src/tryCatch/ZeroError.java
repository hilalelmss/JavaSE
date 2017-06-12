package tryCatch;

import java.util.Scanner;

public class ZeroError {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
		System.out.println(bolme(scanner.nextInt(), scanner.nextInt()));
		}
		catch (ArithmeticException e) {
		
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finallly block");
		}
	}

	private static int bolme(int a, int b) {
		int bolme = a / b;
		return bolme;
	}
}
