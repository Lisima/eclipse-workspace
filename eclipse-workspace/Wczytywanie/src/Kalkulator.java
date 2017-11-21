import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {

	

		Scanner odczyt = new Scanner(System.in);
		
		System.out.print("Podaj liczbê a: ");
		int a = odczyt.nextInt();
		
		System.out.print("Podaj liczbê b: ");
		int b = odczyt.nextInt();
		
		int suma = a+b;
		int mn = a*b;
		double dz = (float)a/b;
		int roz = a-b;
		double pierw = Math.sqrt(a);
		double potega = Math.pow(a, b);
		
		int dzCalk = a/b;
		int reszta = a%b;
		
		System.out.println("PI wynosi: " +Math.PI);
	
		System.out.println("suma wynosi: "+suma);
		System.out.println("mno¿enie wynosi: "+mn);
		System.out.println("dzielnie wynosi: "+dz);
		System.out.println("ró¿nica wynosi: "+roz);
		System.out.println("pierwiastek z a wynosi: "+pierw);
		System.out.println("a do b wynosi: "+potega);
		System.out.println("a / b: "+dzCalk);
		System.out.println("reszta z dziel a / b: "+reszta);
	}

}
