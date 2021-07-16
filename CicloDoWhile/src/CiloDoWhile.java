import java.util.Scanner;

public class CiloDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * do{
		 * codigo
		 * codigo
		 * codigo
		 * while(condicion)}*/

		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		do {
			System.out.println("Escribe tu primer número");
			num1 = sc.nextInt();
			System.out.println("Escribe tu segundo número");
			num2 = sc.nextInt();
		}
		while(num1 != num2);
			System.out.println("Los números " + num1 + " "+ num2 + " son iguales");
		
	}

}
