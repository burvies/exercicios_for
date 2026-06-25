import java.util.Scanner;

public class for_seis {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				
				System.out.println("Os divisores são: " + i);
			}
		}
		
		sc.close();
	}
	

}
