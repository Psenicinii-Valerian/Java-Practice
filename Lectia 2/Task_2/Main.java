public class Main {
	
	public static void main(String[] arg) {
		
		int x = 5 % 2;
		System.out.println(x);

		int a = 1;
		int sum = ++a + a++ + ++a; // ++1 (2) + 2++ (2) + 3++ (4)
		System.out.println(a);
		System.out.println(sum);

		int b = 220;
		int c = 30;

		if(b<c & ++b<100) {}  // aici intra totusi si in expresia ++b<100, deci b devine 221 (cu toate ca 1 parte e gresita)
		if(b<c && ++b<100) {} // aici nu se trece prin expresia ++b<100, deci b ramane 220 (deoarece 1 parte deja e gresita)


		if(b>c | ++b<100) {}  // aici intra totusi si in expresia ++b<100, deci b devine 221 (cu toate ca 1 parte e corecta)
		if(b>c || ++b<100) {} // aici nu se trece prin expresia ++b<100, deci b ramane 220 (deoarece 1 parte deja e corecta)

		



	}


}