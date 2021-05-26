package by.epam.unit02.main;

public class Task03 {

	public static void main(String[] args) {
		int number, hours, minutes, seconds;
		number = 1 + (int)(Math.random() * 86400);
		hours = (int)(number / (60 * 60)) % 60;
		minutes = (int)((number / 60) % 60);
		seconds = (int)(number % 60);
		System.out.println(number + " seconds is " + hours + " hours " + minutes + " minutes " + seconds + " seconds.");
	}
}
