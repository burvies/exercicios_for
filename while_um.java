import java.util.Locale;
import java.util.Scanner;

public class while_um {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a sua senha de Acesso: ");
		int senha = sc.nextInt();
		
		
		while(senha != 2002) {
			System.out.println("Senha Incorreta");
			senha = sc.nextInt();
		}
		
		System.out.println("Bem-Vindo!");
	}

}
