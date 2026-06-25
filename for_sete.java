import java.util.Scanner;

public class for_sete {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor Númerico: ");
		int N = sc.nextInt();
		
	
		for (int i=1; i<=N; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		sc.close();
	}

}
