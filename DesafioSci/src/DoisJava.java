import java.util.Scanner;

public class DoisJava {
	public static void main(String[] args) {
		/*Solicitar 5 números, ao fim, imprimir o número maior e o número menor.*/
		Scanner scan = new Scanner(System.in);
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int numeroInserido = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o numero "+(i+1)+" de 5");
			numeroInserido = scan.nextInt();
			if (numeroInserido < menor) {
				menor = numeroInserido;
			}
			
			if(numeroInserido > maior ) {
				maior = numeroInserido;
			}
			
		}
		System.out.println("O maior numero e "+maior+" o menor numero é "+menor);
		scan.close();
	}

}
