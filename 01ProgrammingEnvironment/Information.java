import java.util.Scanner;

public class Information{
	public static void main(String[] args) {
		System.out.println("*** INFORMATION CENTER ***");
		Scanner scanner =  new Scanner(System.in);

		System.out.print("Enter your full name: ");
		String name = scanner.nextLine();

		System.out.print("Enter your date of birth: ");
		String dob = scanner.nextLine();

		System.out.print("Enter your occupation: ");
		String job = scanner.nextLine();

		System.out.print("Enter your position: ");
		String role = scanner.nextLine();

		System.out.print("Enter your company name: ");
		String company = scanner.nextLine();



		System.out.println("--- YOUR INFORMATION ---");
		System.out.println("Full Name: " + name);
		System.out.println("Date of Birth " + dob);
		System.out.println("Job title: " + job);
		System.out.println("Job level: " + role);
		System.out.println("Company: " + company);
	}
}
