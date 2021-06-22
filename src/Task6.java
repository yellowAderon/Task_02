import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		int a, b, c, d;
		a = 2;
		b = 3;
		c = 1;
		d = 4;
		double temp1 = (a/c)*(b/d);
		double temp2 = (a*b-c)/(c*d);
		double result = temp1-temp2;
		System.out.println("результат = " + result);
}
}

