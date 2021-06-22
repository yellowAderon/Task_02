import java.util.Scanner;

public class Task4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x;
int summ = 0;
 
while (true) {System.out.println("¬ведите число: ");
	if (!sc.hasNextInt()) {
	sc.nextLine();
	System.out.println("¬ведите число:");
	} else {x = sc.nextInt(); 
	summ = summ + x;
	System.out.println("—умма равна: " + summ);
	
}
}
}
}

