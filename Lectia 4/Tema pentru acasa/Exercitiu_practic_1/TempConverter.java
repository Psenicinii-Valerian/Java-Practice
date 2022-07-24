public class TempConverter {

	public void convertToFahr(double celsius) {		

		double tempCelsiusToFahrenheit = (celsius * 9/5) + 32;

		printResult(celsius, tempCelsiusToFahrenheit, "F", "C");
	}

	public void printResult(double initial, double result, String from, String to){
		if ((initial % 1) == 0 && (result % 1) == 0) { 
			int degree = (int)initial;
			int conversion = (int)result;
			System.out.println(degree + "\u00B0" + "C --> " + conversion + "\u00B0" + "F" );	
		} 

			else if ((initial % 1) == 0 && (result % 1) != 0) {
				int degree = (int)initial;
				System.out.println(degree + "\u00B0" + "C --> " 
								   + String.format("%.2f", result) + "\u00B0" + "F" );
			}

			else if ((initial % 1) != 0 && (result % 1) == 0) {
				int conversion = (int)result;
				System.out.println(initial + "\u00B0" + "C --> " + conversion + "\u00B0" + "F" );			
			}

			else if ((initial % 1) != 0 && (result % 1) != 0) {
				System.out.println(String.format("%.2f", initial) + "\u00B0" + "F --> " + 
								   String.format("%.2f", result)  + "\u00B0" + "C" );		
			}
	}

	public void convertToCelsius(double fahr) {

		double tempFahrenheitToCelsius = (fahr - 32) * 5/9;

		printResult(fahr, tempFahrenheitToCelsius, "F", "C");
	}

}