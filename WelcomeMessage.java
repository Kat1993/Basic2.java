package demos;

public class WelcomeMessage {

	public static void main(String[] args) {
		System.out.println("Starting Welcome message");
		
		String name;
		name = "Steve";
		String date ="Friday, 2:12PM";
		double transactionAmount = 39.58;
		char sign = '+';
		
		System.out.println(name);
		System.out.println(date);
		System.out.println(transactionAmount);
		
    System.out.println("Hi "+ name +", welcome back! Your last login was "+ date +". Your last transaction was for " + sign+"$"+ transactionAmount +". ");
	}

}
