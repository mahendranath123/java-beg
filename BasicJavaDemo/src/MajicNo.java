import java.util.Scanner;

public class MajicNo {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number to check: ");
		int number = scanner.nextInt();
		if (magicNumber(number))
			System.out.println(number + " is a magic number.");
		else
			System.out.println(number + " is not a magic number.");
	}

	public static boolean magicNumber(int number) {
		if (((number - 1) % 9) == 0)
			return true;
		else
			return false;
	}
}
