import java.util.Scanner;

public class UmJava {

	public static void main(String[] args) {
		/*Solicitar a inserção de 5 números, ao final,
		  imprimir os números pares, números ímpares
		  e a média geral desses números.*/
		String pares = "", impares="";
		double media = 0;
		int numeroAtual = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o numero "+(i+1)+" de 5");
			numeroAtual = scan.nextInt();
			media = numeroAtual;
			if(numeroAtual%2 == 0 ) {
				pares += numeroAtual+" ";
			}else {
				impares += numeroAtual+" ";
			}
		}
		System.out.println("Numeros Pares: " + pares);
		System.out.println("Numeros Impares " + impares);
		System.out.println("Media "+ media/5);
		scan.close();
	}

}
