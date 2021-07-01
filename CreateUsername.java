import java.util.Scanner;
public class StringCreateUsername {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String firstname = input.nextLine();
		System.out.print("Enter surname: ");
		String surname = input.nextLine();
		if (createUsername(firstname, surname).equals("null")) {
			System.out.println("Not enough letters to create a username!");
		}else {
		System.out.println(createUsername(firstname, surname));
		}
	}
	private static String createUsername(String first, String sur) {
		String username = "";
		if (first.length() >= 2 && sur.length()>=3) {
		for (int i = 0; i < 3; i++) {
			char result = sur.charAt(i);
			username = username + result;
		}
		for (int i = 0; i < 2; i++) {
			char result = first.charAt(i);
			username = username + result;
		}
		}else {
			username = "null";
		}
		return username.toLowerCase();
	}
}
