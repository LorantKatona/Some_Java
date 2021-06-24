public class MethodsFactorial {
	public static void main(String[] args) {	 
		
		int number = 9;
		for (int i = 1; i <= number; i++ ) {
			System.out.println(i + "! = " + factorial(i));
		}
	}
		private static int factorial(int number) {
			int factorial = 1;
			for (int i=1; i<=number; i++ ) {
				factorial *= i;
		}
			return (factorial);
		}
}
