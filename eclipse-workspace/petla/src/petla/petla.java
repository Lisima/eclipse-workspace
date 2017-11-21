package petla;

import java.util.Scanner;

public class petla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			int number;
			int sum=0;
			int sr=0;
			int counter=0;
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			do
			{
				System.out.print("Podaj liczbê: ");
				number = scanner.nextInt();
				sum = sum +number;
				counter++;
				if( number > max && (number !=0) )
				{
					max = number;
					
				}
				
				if( number < min);
				{
					min = number;
					
				}
				
			
			}while( number != 0 );
			counter--;
			double average =(double)sum/counter;
			
			System.out.println("min wynosi: " +min);
			System.out.println("max wynosi: " +max);
			System.out.println("Suma wynosi: " +sum);
			System.out.println("Œrednia wynosi: " +average);
			
			
			
			scanner.close();
	}

}
