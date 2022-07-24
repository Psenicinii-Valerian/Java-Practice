public class TempConverter {
	
	public static void main(String[] arg) {
	
		int degreeCelsius = 20;           // temperature in degrees Celsius 
		float degreeFahreinheit = 75.55F; // temperature in degrees Fahrenheit ;

		float tempCelsiusToFahrenheit = (degreeCelsius * 9/5F) + 32;
		float tempFahrenheitToCelsius = (degreeFahreinheit - 32) * 5/9;

		System.out.println(degreeCelsius + " degree Celsius = " + tempCelsiusToFahrenheit + " degree Fahrenheit" );
		System.out.println(degreeFahreinheit + " degree Fahrenheit = " + tempFahrenheitToCelsius + " degree Celsius" );
	
	}


}