import java.util.Locale;
import java.util.Scanner;

public class exercicios_while {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Digite um valor: ");
		
		int x = sc.nextInt();
		
		int soma = 0;
		
		while(x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		
	}

}
