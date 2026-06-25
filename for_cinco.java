import java.util.Scanner;

public class for_cinco {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Sistema para ler o Fatorial do Número Digitado.
		
		System.out.print("Digite um valor Númerico: ");
		
		int N = sc.nextInt();
		
	    int fatorial = 1;
	    
	    for(int i = 1; i <= N; i++) {
	    	fatorial = fatorial * i;
	    }
	    System.out.println("O Fatorial do Número digitado é: " + fatorial);
	    
	    sc.close();
	}


}
