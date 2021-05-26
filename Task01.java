package by.epam.unit02.main;

public class Task01 {

	public static void main(String[] args) {
		double a, b, c, result;
		a = 1 + (int)(Math.random() * 10);
		b = 1 + (int)(Math.random() * 10);
		c = 1 + (int)(Math.random() * 10);
        result = (a - 3) * b / 2 + c;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("result = " + result);
	}
}
