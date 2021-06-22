import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc;
		int a,b,c;
		double d, result;
		sc = new Scanner(System.in);
		System.out.println("a=");		a = sc.nextInt();
		System.out.println("b=");		b = sc.nextInt();
		System.out.println("c=");		c = sc.nextInt();
		d = Math.log(b*b+1);
		result = a*a-(b-c)*(b-c)+d;
		System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d + " Результат выражения=" + result);
		}
}
