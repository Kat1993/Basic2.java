package demos;

public class FlooringInslation {

	public static void main(String[] args) {
		int squareFeet = 2000;
		String floorType ="Hardwood";
		
		
	// call  the function
		double quote= getQuote(squareFeet, floorType);
		
		
		
		// define  function 
		//Perameters: squer feet, floor type
		System.out.println(quote);
		
	}
	private static  double getQuote(int squareFeet, String floorType) {
		System.out.println("Quote Function");
		System.out.println("SquerFeet: "+ squareFeet);
		System.out.println("Floor Type: "+ floorType);
		
		double baseRate = 3;
		double carpetRate =.5;
		double hardwoodRate = 1.5;
		double hardwardFee =100;
		double totalRate=0;
		double totalCost= 0;
		// determinr floor tipr and rate 
		
		if (floorType == "Carpet") {
			totalRate = baseRate+ carpetRate;
		} else if (floorType =="Hardwood") {
			totalRate = baseRate + hardwoodRate;
			totalCost = totalCost + hardwardFee;
			
		}
		else {
			System.out.println("Error: Could not read floor type ");
		}
		
		
		// calculate
		System.out.println("Total Rate "+ totalRate);
		
		totalCost = totalRate * squareFeet + hardwardFee;
		
       // applay discoutn >= 1500 
		if (squareFeet >= 1500) {
			double discount = totalCost * .1;
			System.out.println(discount);
			totalCost= totalCost - discount;}
		
			System.out.println("$ " + totalCost);
			return totalCost;
			
		}
	
	}


