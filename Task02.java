package by.epam.unit02.main;

public class Task02 {

	public static void main(String[] args) {
		int x, y, min, max;
		x = 1 + (int)(Math.random() * 100);
		y = 1 + (int)(Math.random() * 100);
        System.out.println("Initial state: x = " + x + ", y = " + y);
        min = Math.min(x, y);
        max = Math.max(x, y);
        x = max;
        y = min;
        System.out.println("Final state: x = max = " + x + ", y = min = " + y);
	}
}
