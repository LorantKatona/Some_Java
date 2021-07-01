import java.util.Scanner;
public class StringBackwards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputText = input.nextLine();
		
		System.out.println(reverse(inputText));
	}
	private static String reverse(String text) {
		String  reverseString = "";
		for (int i = text.length() - 1; i >=0  ; i--) {
			char result = text.charAt(i);
			reverseString = reverseString+result;
		}
		return reverseString;
	}
}
