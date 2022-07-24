import java.util.Scanner;

public class App{

	public static void main (String[] args){

		Scanner myInput = new Scanner (System.in);

		System.out.print("Insert a = ");
		int a = myInput.nextInt();

		System.out.print("Insert b = ");
		int b = myInput.nextInt();

	    System.out.println();

		Calculator.sum(a, b);

		System.out.println();

		Calculator calc = new Calculator();

		System.out.println();

		System.out.print("Insert c = ");
		int c = myInput.nextInt();

		System.out.print("Insert d = ");
		int d = myInput.nextInt();

		System.out.println();
		
		System.out.println("Diff: " + c + '-' + d + '=' + calc.diff(c,d));

		System.out.println();

		System.out.print("Insert e = ");
		int e = myInput.nextInt();

		System.out.print("Insert f = ");
		int f = myInput.nextInt();

		System.out.println();

		System.out.println("Division: " + e + '/' + f + '=' + calc.division(e,f));

		System.out.println();

		Calculator multiplication = new Calculator();

		System.out.println();

		System.out.print("Insert g = ");
		int g = myInput.nextInt();

		System.out.print("Insert h = ");
		int h = myInput.nextInt();

		System.out.println();
	
		multiplication.multiplication(g,h); // aici se putea de operat si cu calc dar am vrut sa mai schimb obiectul

	}

}