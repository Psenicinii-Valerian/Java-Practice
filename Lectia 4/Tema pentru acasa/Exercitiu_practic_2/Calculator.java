public class Calculator {

	public Calculator(){
		System.out.println("Initializing class Calculator!");
	}

	public static void sum(int a, int b){
		System.out.println("Sum: " + a + '+' + b + '=' + (a+b));
	} 

	public int diff(int a, int b){
		return (a-b);
	} 


	public static float division(int a, int b){
		return ( (float)a / b );
	}

	public void multiplication(int a, int b){
		System.out.println("Multiplication: " + a + '*' + b + '=' + (a*b));
	}
}