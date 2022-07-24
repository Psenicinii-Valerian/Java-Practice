public class App {

	public static void main (String[] args) {

		Algebra calculator = new Algebra();
		// calculator.sum(3,2);	-> prints Sum: 5
		int result = calculator.sumExtern(3, 2);
		System.out.println(result); // -> prints 5
	    calculator.checkEvenOdd(result);

		// Dupa introducerea 'static'
		int ressult = Algebra.sumExtern(3, 6);
		Algebra.checkEvenOdd(result);
	}
}