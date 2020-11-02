public class LuasTicket{
	
	
	private String customer;
	private int zones;
	private double price;
	private double [] priceArr = new double[7];
	
	
	
	public LuasTicket(){
	}
	
	
	public void setCustomer(String customer){
		this.customer = customer;
	}
	
	
	public void setZones(int zones ){
		this.zones = zones;
	}
	
	
	public double getPrice(){
		return price;
	}
	
	
	
	public void computePrice(){//
		switch (customer){
			case "adult":
			if(zones == 1){
				price = 1.50;
			}else if(zones == 2){
				price = 2.30;
			}else if (zones >=3&&zones <=8){
				price = 2.90;
			}else{
				System.out.println("Invalid Selection");
			}
			break;
			
			case "child":
			if(zones == 1 || zones == 2){
				price = 1;
			}else if (zones>=3&&zones<=8){
				price = 1.20;
			}else {
				System.out.println("Invalid selection");
			}
			break;
			default:
				System.out.println("Invalid Selection");
			
		}		
		
		
	}//Close computePrice
	
	
	
	
		
		
	public void setPriceArr(double[] priceArr){
		this.priceArr = priceArr;
	}
	
	
	
	public void totalPrice(double [] priceArr){
		
		double total = 0;
		
		for(int i =0;i<priceArr.length;i++){
			
			total += priceArr[i];
			}
			System.out.println("price for week = " + total);
			
			double avg = total/priceArr.length;
			System.out.println("Average price for week = " + avg);
			
			
		
		
	}
	
	
}//Close class