import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner q1 = new Scanner(System.in);
		System.out.println("In: ");
		String an = q1.nextLine();
		System.out.println(an);
		q1.close();		
	}

	public static void q2() {
		Scanner w = new Scanner(System.in);
		System.out.print("In: ");
		int word1 = w.nextInt();
		System.out.print("In: ");
		int word2 = w.nextInt();
		System.out.println(word1 / word2);
		System.out.println(word1 % word2);	
		w.close();
		
	}

	public static void q3() {
		Scanner s = new Scanner(System.in);
		System.out.println("In ");
		String a = s.nextLine();
		System.out.println(a + " Was the text you wrote "); 
		s.close();		
	}

	public static void q4() {
		Scanner q = new Scanner(System.in);
		System.out.print("In: ");
		double b = q.nextDouble();
		System.out.println(b - 3.2);
		q.close();
	}

	public static void q5() {
		Scanner t = new Scanner(System.in);
		System.out.println("In:");
		Boolean bool = t.nextBoolean();
		System.out.println(bool + " is a boolean");
		t.close();
	}

	public static void q6() {
		Scanner o = new Scanner(System.in);
		System.out.println("In:");
		double bob = o.nextDouble();
		System.out.println(bob - 3.2);
		o.close();

	}

}
