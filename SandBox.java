import java.util.Scanner;

public class SandBox {

	public static void main(String[] args) {
		// Read in a number and see if it is between 1 and 100 (inclusive).
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the student mark: ");
		float mark = sc.nextFloat ();

//		if (mark < 1 || mark > 100) 
//			System.out.println ("\nError in input - the mark must be between 1 and 100 (inclusive).");
//		else
//			System.out.println ("\nThank you. The mark has been accepted.");
		
		if (mark >= 1 && mark <= 100) 
			System.out.println ("\nThank you. The mark has been accepted.");
		else
			System.out.println ("\nError in input - the mark must be between 1 and 100 (inclusive).");
		
		System.out.print ("Enter the gender M/F: ");
		String gender = sc.next ();
		
		if (gender.equalsIgnoreCase("F"))
		//if (gender.equals("F") || gender.equals("f")) 
			System.out.println ("\nYou are female.");
		else if (gender.equals("M") || gender.equals("m")) 
			System.out.println ("\nYou are male.");
		else
			System.out.println ("\n" + gender + " is not a valid gender.\n");
	}

}
