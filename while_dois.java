import java.util.Locale;
import java.util.Scanner;

public class while_dois {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a coordenada X: ");
		
		int x = sc.nextInt();
		
		System.out.print("Digite a coordenada Y: ");
		
		int y =sc.nextInt();
		
		while(x > 0 && y > 0) {
			System.out.println("Primeiro Quadrante");
			x = sc.nextInt();
			y =sc.nextInt();
		}
		
		while(x > 0 && y < 0) {
			System.out.println("Quarto Quadrante");
			x = sc.nextInt();
			y =sc.nextInt();
		}
		
		while(x < 0 && y < 0) {
			System.out.println("Terceiro Quadrante");
			x = sc.nextInt();
			y =sc.nextInt();
		}
		
		while(x < 0 && y > 0) {
			System.out.println("Segundo Quadrante");
			x = sc.nextInt();
			y =sc.nextInt();
		}
		
		System.out.println("O valor 0 e nulo");
		
		
	}

}
