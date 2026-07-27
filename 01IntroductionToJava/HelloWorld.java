import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n*** CLUB INFORMATION CENTER ***");

		System.out.print("Enter your club name: ");
		String clubName = scanner.nextLine();

		System.out.print("Enter your club nickname: ");
		String clubNickname = scanner.nextLine();
	
		System.out.print("Enter your club's founding year: ");
		int foundingYear = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter your club's manager: ");
		String managerName = scanner.nextLine();

		System.out.print("Enter your club's location: ");
		String location = scanner.nextLine();

		System.out.print("Enter your club's biggest ICON: ");
		String biggestIcon = scanner.nextLine();

		System.out.print("Enter your club's biggest silverware: ");
		String biggestSilverware = scanner.nextLine();


		System.out.println("\n*** CLUB INFORMATION ***");
		System.out.println("- Club Name: " + clubName);
		System.out.println("- Club Nickname: " + clubNickname);
		System.out.println("- Founding Year: " + foundingYear);
		System.out.println("- Manager: " + managerName);
		System.out.println("- Location: " + location);
		System.out.println("- Biggest Icon: " + biggestIcon);
		System.out.println("- Biggest Silverware: " + biggestSilverware);

	}

}
