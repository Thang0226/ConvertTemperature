import java.util.Scanner;

public class ConvertTemperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double fahrenheit;
		double celsius;
		int choice;

		do {
			System.out.println();
			System.out.println("Menu.");
			System.out.println("1. Fahrenheit to Celsius");
			System.out.println("2. Celsius to Fahrenheit");
			System.out.println("0. Exit");
			System.out.println("Enter your choice: ");
			choice = input.nextInt();

			switch (choice) {
				case 1:
					System.out.println("Enter fahrenheit: ");
					fahrenheit = input.nextDouble();
					System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
					break;
				case 2:
					System.out.println("Enter Celsius: ");
					celsius = input.nextDouble();
					System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
					break;
				case 0:
					break;
				default:
					System.out.println("Not a choice!");
			}
		} while (choice != 0);
	}

	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		fahrenheit = Math.round(fahrenheit * 100.0) / 100.0;
		return fahrenheit;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		celsius = Math.round(celsius * 100.0) / 100.0;
		return celsius;
	}
}
