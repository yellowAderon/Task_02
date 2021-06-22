import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		double fx;
		double temp,x;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите x:");
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("¬ведите x:");
			
			}
		x = sc.nextDouble();
		if ((x<=3) & (x>-3)) {System.out.println("¬ведено недопустимое значение");}
		else {if(x<=-3) {fx = 9;
		System.out.printf("fx= %.4f",  fx);}
		else if (x>3) {fx = 1/(x*x+1);
		System.out.printf("fx= %.4f",  fx);}
		}
		}
}		
		
			
		
	
		

