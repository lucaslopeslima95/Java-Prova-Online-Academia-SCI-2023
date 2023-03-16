import java.util.Scanner;

public class QuatroJava {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[5];
		for (int i=0;i<5;i++) {
			System.out.println("Infome o "+(i+1)+"º dos 5");
			 numeros[i] =scan.nextInt();
		}
		System.out.println("O Numero da posicao 3 e "+numeros[2]);
		scan.close();
	}
}
