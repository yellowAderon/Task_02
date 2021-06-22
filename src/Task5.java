import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = 2;
		b = 3;
		c = 1;
		double temp1 = Math.sqrt(b*b+4*a*c);
		double temp2 = Math.pow(a, 3);
		double result = (b+temp1)/(2*a)-(temp2*c+b);
		System.out.println("результат = " + result);
}
}