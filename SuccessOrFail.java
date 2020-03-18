import java.util.Scanner;
public class SuccessOrFail {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input score: ");
		int score = scanner.nextInt();
		if (score >= 80)
			system.out.println("congratulation");

		scanner.close();
	}
}
