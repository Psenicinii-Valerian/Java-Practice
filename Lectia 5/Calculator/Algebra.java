public class Algebra {

	public Algebra(){
		System.out.println("INITIALIZAM clasa Algebra!");
	}

	public static void sum(int a, int b){
		System.out.println("Suma: " + (a + b));
	} 

	public static int sumExtern(int a, int b){
		return a + b;
	}


	public static void division(int a, int b){

	}

	public static void substract(){
		
	}

	public static void checkEvenOdd(int result) {
		boolean isEven = result % 2 == 0;
		System.out.println("Suma este para: " + isEven);
	}
}