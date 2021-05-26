package by.epam.unit02.main;

public class Task06 {

	public static void main(String[] args) {
		double m, n, fractional;
		int whole, min, max;
		m = 1 + (int)(Math.random() * 1000);
		n = 1 + (int)(Math.random() * 1000);
		whole = (int)(m / n);
		fractional = (m / n) - whole; 
		min = whole % 10;
		max = (int)(fractional * 10); 
        System.out.println("M = " + m + ", N = " + n + ", M/N = " + m / n);
        System.out.println("whole = " + whole + ", fractional = " + fractional);
        System.out.println("Младшая цифра целой части = " + min + ", старшая цифра дробной части = " + max);
	}
}
