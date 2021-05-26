package by.epam.unit02.main;

public class Task08 {

	public static void main(String[] args) {
		int x, y;
		boolean result;
		x = -100 + (int)(Math.random() * (100 - (-100) + 1));
		y = -100 + (int)(Math.random() * (100 - (-100) + 1));
		if (((x > -100 & x < 100) & (y > -50 & y < 0)) | ((x > -50 & x < 50) & (y > 0 & y < 50))) {
			result = true;
			System.out.println("x = " + x + ", y = " + y + ". RESULT = " + result + ". Точка (" + x + ", " + y + ") принадлежит закрашенной области.");
		}
		else {
			result = false;
			System.out.println("x = " + x + ", y = " + y + ". RESULT = " + result + ". Точка (" + x + ", " + y + ") не принадлежит закрашенной области.");
		}
	}
}
