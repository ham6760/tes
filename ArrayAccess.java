import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int intArray[] = new int[5];
		int max=0;
		System.out.println("5number input");
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max)
				max = intArray[i];
		}
		System.out.print("Maxnum " + max + ".");

		scanner.close();
	}
}
