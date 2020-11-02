import java.util.Scanner;



public class LuasTicketApp{

	public static void main(String args[]){
		
		
	Scanner sc = new Scanner (System.in);
	LuasTicket myLuas = new LuasTicket();

	
	System.out.println("Child or Adult");
	String passenger = sc.next();
	myLuas.setCustomer(passenger);
	
	
	System.out.println("How many Zones?"); 
	int journey = sc.nextInt();
	myLuas.setZones(journey);
	
	
	
	
	myLuas.computePrice();	
	double cost = myLuas.getPrice();
	System.out.println("Price = "+ cost);
	
	
	
	
	System.out.println("Prices for week");
	
	double prices[];
	prices = new double[7];
	
	for (int i =0; i<prices.length; i++){
			prices[i] = sc.nextDouble();
		}
		
		
		
	myLuas.setPriceArr(prices);
	
	
	
	myLuas.totalPrice(prices);
	
	
	
	
	}//close main method
	
	
	
}//close class