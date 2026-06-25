import java.util.Locale;
import java.util.Scanner;

public class for_tres {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantas Médias Ponderadas serão realizadas: ");
		int N = sc.nextInt();
		
		double somaMedias = 0; //Cálculo da Média
		
		for(int i = 0; i < N; i++) {
		
	    System.out.print("Resultado Primeira Prova: ");
		double teste1 = sc.nextDouble();
		System.out.print("Resultado Segunda Prova: ");
		double teste2 = sc.nextDouble();
		System.out.print("Resultado Terceira Prova: ");
		double teste3 = sc.nextDouble();
		
		double media = (teste1 * 2 + teste2 * 3  + teste3 * 5) / 10;
		
		somaMedias += media;
		
		System.out.printf("A média é: %.1f%n", media);
		}
		
		System.out.println("A soma das médias é: " + somaMedias);
		if(somaMedias >= 20) {
			System.out.print("APROVADO.");
		}
		
		else {
			System.out.print("REPROVADO");
		}
		
	}

}
