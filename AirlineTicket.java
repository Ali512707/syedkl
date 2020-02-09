package Ticket;

import java.util.Scanner;

public class AirlineTicket {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Is it a roundtrip");
		String roundtrip = scanner.nextLine();

		System.out.println("please enter origin");
		String origin = scanner.nextLine();
		System.out.println("please enter destination");
		String destination = scanner.nextLine();
		System.out.println("how many tickets ");
		int tickets = scanner.nextInt();
		System.out.println("how much the price of ticket");
		int priceofticket = scanner.nextInt();
		
		//Scanner ticketClassValue = new Scanner(System.in);
		System.out.println("what is the ticketclass");
	    String ticketClass = scanner.next();
	 




       final double tax = 0.06;
       
		double Total = priceofticket * tickets * tax + priceofticket*tickets;
		
        
		

		System.out.println(Total);

		System.out.println("\n\n--------------");
		System.out.println("Welcome to Global flight");
		System.out.println("02/05/2020");
		System.out.println("your Flight sumary");
		System.out.println("class ." + ticketClass);

		System.out.println("Price ." + priceofticket);
		System.out.println("State Tax ." + tax);
		System.out.println("Total ." + Total);
		System.out.println("Thanks for flying Globalflights");







	}

}
