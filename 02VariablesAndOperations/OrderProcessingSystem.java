import java.util.Date;
import java.util.Scanner;

public class OrderProcessingSystem {
	
	public static final String STORE_NAME = "VN Gear Official Store";
	public static final double VAT_RATE = 0.1;
	public static final char CURRENCY_SYMBOL = 'Đ';

	public static void main(String[] args) {
		
		System.out.println(STORE_NAME);

		Scanner scanner = new Scanner(System.in);
		
		long keyboardID = 123L;
		System.out.print("Please enter the price of Corsair K70 TKL Wireless: ");
		double keyboard = scanner.nextDouble();
		System.out.print("Quantity: ");
		int quantityK = scanner.nextInt();
		
		long mouseID = 456L;
		System.out.print("Please enter the price of Corsair Katar Pro Wireless: ");
		double mouse = scanner.nextDouble();
		System.out.print("Quantity: ");
		int quantityM = scanner.nextInt();
		
		long headphoneID = 789L;
		System.out.print("Please enter the price of JBL LIVE 770NC: ");
		double headphone = scanner.nextDouble();
		System.out.print("Quantity: ");
		int quantityH = scanner.nextInt();

		System.out.print("Please enter DISCOUNT THRESHOLD: ");
		double discount = scanner.nextDouble();

		double bill = (keyboard*quantityK + mouse*quantityM + headphone*quantityH);
		double BILL = bill + bill*VAT_RATE - discount;

		int rewardPoint = (int) (BILL/100000.0);

		System.out.println("Your total bill: " + BILL + CURRENCY_SYMBOL);
		System.out.println("Your reward point earned for this bill: " + rewardPoint);
		
	}
}
