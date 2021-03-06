import java.util.Scanner;

public class StringLettersAndDigits {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputText = input.nextLine();
		int countDigits = 0;
		int countLetters = 0;
		for (int i = 0; i < inputText.length(); i++) {
			if (Character.isLetter(inputText.charAt(i))) {
				countLetters++;
			}
			if (Character.isDigit(inputText.charAt(i))) {
				countDigits++;
			}
		}
		System.out.println(countLetters + " letter(s)");
		System.out.print(countDigits + " digit(s)");
	}
}
