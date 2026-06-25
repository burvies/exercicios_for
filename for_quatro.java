import java.util.Locale;
import java.util.Scanner;
public class for_quatro {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos pares de Números serão divididos: ");
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			System.out.println("Digite os números a dividir: ");
		
			double num1 = sc.nextDouble();		
			double num2 = sc.nextDouble();	
			
			System.out.print("O resultado da divisão é: ");
			double divi1 = num1 / num2;
			if(num2 == 0) {
				System.out.println("Divisão Ímpossivel");
			}
			else {
				System.out.println(divi1);
			}
		}
		
		
	}

}
