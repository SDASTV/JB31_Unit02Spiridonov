package by.epam.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		int a, b, c, a1, b1, c1;
		a = -10 + (int)(Math.random() * (10 - (-10) + 1));
		b = -10 + (int)(Math.random() * (10 - (-10) + 1));
		c = -10 + (int)(Math.random() * (10 - (-10) + 1));
		if (a > 0) {
			a1 = (int) Math.pow(a, 2);
		}
		else {
			a1 = (int)Math.pow(a, 4);
		}
		if (b > 0) {
			b1 = (int)Math.pow(b, 2);
		}
		else {
			b1 = (int)Math.pow(b, 4);
		}
		if (c > 0) {
			c1 = (int)Math.pow(c, 2);
		}
		else {
			c1 = (int)Math.pow(c, 4);
		}
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		System.out.println("a1 = " + a1 + ", b1 = " + b1 + ", c1 = " + c1);
	}
}
