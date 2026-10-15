//import java.util.Scanner;
package agh.po.lab1;

public class Choinka {
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj wysokosc chonki");
		//int h = scanner.nextInt();
		int h = Integer.parseInt(args[0]);
		for (int i = 0; i<h; i++) {
			for (int j = 0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}