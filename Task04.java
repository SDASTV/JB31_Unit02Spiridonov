package by.epam.unit02.main;

public class Task04 {

	public static void main(String[] args) {
		int x1, y1, x2, y2;
		double d;
		x1 = -100 + (int)(Math.random() * (100 - (-100) + 1));
		y1 = -100 + (int)(Math.random() * (100 - (-100) + 1));
		x2 = -100 + (int)(Math.random() * (100 - (-100) + 1));
		y2 = -100 + (int)(Math.random() * (100 - (-100) + 1));
        System.out.println("x1 = " + x1 + ", y1 = " + y1);
        System.out.println("x2 = " + x2 + ", y2 = " + y2);
		d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		System.out.println("Расстояние между точками (" + x1 + ", " + y1 + ") и (" + x2 + ", " + y2 + ") = " + d);
	}
}
