import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		double fx;
		double a,b,h, x;
		a = 1;
		b = 15;
		h = 1;
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "fx");
		System.out.println("---------------------------------");
			while(a<=b) {fx = 2*Math.tan(a/2)+1;
			System.out.printf("|\t%.2f\t|\t%.2f\t|\n", a, fx);
			a = a+h;
			
			}
	}		
}
