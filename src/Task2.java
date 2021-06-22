
public class Task2 {
	public static void main(String[] args) {
		double firstK;
		double secondK;
		double S;
		double hypotenuse;
		double A;
		firstK = 10;
		secondK = 12;
		hypotenuse = Math.hypot(firstK, secondK);
		S = firstK*secondK/2;
		System.out.println("Гипотенуза = " + hypotenuse);
		System.out.println("Площадь равна = " + S);
		}
}
