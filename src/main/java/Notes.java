import java.util.Scanner;

class Notes {
	public static void main(String[] args) {

		//input
		Scanner s = new Scanner(System.in);

		//each save as their appropriate
		// s.nextLine(); //String
		// s.nextInt(); //Int
		// s.nextDouble(); //double
		// s.nextBoolean(); //boolean
		// s.next(); //don't use


		// int a = s.nextInt();
		// System.out.println(a+10);
		
		
		//DONT DO THIS
		// double a = s.nextDouble();
		// System.out.println(a);
		// String b = s.nextLine();
		// System.out.println(b);

		//clear the scanner;
		//nextInt, nextDouble, nextBoolean (ANYTHING BUT NEXTLINE)
		//clear the scanner using nextLine();
		// int a = s.nextInt();
		// s.nextLine(); //clears the scanner;

		//prompt

		System.out.print("Input a number: ");
		int a = s.nextInt();
		System.out.println("Your number was " + a);
	}
}
