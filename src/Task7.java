import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ �����:");
		a = sc.nextInt();
		if (a >= 0) {a=a*a;}
		else {a=Math.pow(a, 4);}
		System.out.println("������� ������ �����:");
		b = sc.nextInt();
		if (b >= 0) {b=b*b;}
		else {b=Math.pow(b, 4);}
		System.out.println("������� ������ �����:");
		c = sc.nextInt();
		if (c >= 0) {c=c*c;}
		else {c=Math.pow(c, 4);}
		System.out.println("���������: " + a + " " + b + " " + c);
		
}
}
