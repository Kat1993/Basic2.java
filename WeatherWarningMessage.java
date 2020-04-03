package demos;

public class WeatherWarningMessage {

	public static void main(String[] args) {
		//convert the temp from c to f 
		double degreesC= 45;
		double degreesF = (degreesC * 9/5)+ 32;
		
		
		// ptint temt in f 
		System.out.println(degreesF+"F");
		
		
		// test the temp to print aditional worning messege 
		// less the 32>> freezing
		// above 105 
		if(degreesF < 32) {
			System.out.println("Worning :freezing Temp");
			
		}
		else if (degreesF > 105) {
			System.out.println("Worning: Heat advisory");
		}
		else {
			System.out.println("Weather shuld be pleasant" );
		}
	}

}
