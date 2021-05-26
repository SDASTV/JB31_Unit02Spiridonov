package by.epam.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		int x, y;
		double result;
		x = 1 + (int)(Math.random() * 180);
		y = 1 + (int)(Math.random() * 180);
		result = (Math.sin(Math.toDegrees(x)) + Math.cos(Math.toDegrees(y))) /
				 (Math.cos(Math.toDegrees(x)) - Math.sin(Math.toDegrees(y))) *
				 Math.tan(Math.toDegrees(x * y));
		System.out.println("x = " + x + ", y = " + y + ", result = " + result);
	}
}
