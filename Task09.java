package by.epam.unit02.main;

public class Task09 {

	public static void main(String[] args) {
		int x;
		double result;
		x = -10 + (int)(Math.random() * (10 - (-10) + 1));
		if (x <= -3) {
			result = 9;
		}
		else {
			result = 1 / (Math.pow(x, 2) + 1);
		}
		System.out.println("x = " + x + "; result = " + result);
	}
}
