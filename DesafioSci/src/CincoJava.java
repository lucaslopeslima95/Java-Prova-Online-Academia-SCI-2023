
import java.util.Scanner;

public class CincoJava {

	public static void main(String[] args) {
		double media = 0.0;
		double nota = 0.0;
		double[] medias = new double[3];
		String[][] boletin = new String[6][3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			media=0.0;
			System.out.println("Informe o nome do aluno");
			boletin[0][i] = scan.next();
			for (int j = 1; j < 5; j++) {
				System.out.println("Informe sua nota");
				nota =  scan.nextDouble();
				media += nota;
				boletin[j][i] = String.valueOf(nota); 
			}
			medias[i] = media/4;
			boletin[5][i] = String.valueOf(media/4);
		}
		exibeMediasComNome(boletin);
		exibeMaiorNota(medias, boletin);
		exibeMenorNota(medias, boletin);
		scan.close();
	}

	public static void exibeMediasComNome(String[][] boletin) {
		for (int i = 0; i < 3; i++) {
			System.out.println("O aluno "+boletin[0][i]+" tirou a media "+boletin[5][i]);
		}
	}
	public static void exibeMaiorNota(double[] medias,String[][] boletin) {
		if(medias[0]>medias[1] || medias[0]>medias[2]){
			
			System.out.println("O Aluno "+boletin[0][0]+" teve a maior media e foi "+medias[0]);
			
		}else if(medias[1]>medias[2]){
			
			System.out.println("O Aluno "+boletin[0][1]+" teve a maior media e foi "+medias[1]);
			
		}else{
			
			System.out.println("O Aluno "+boletin[0][2]+" teve a maior media e foi "+medias[2]);
			
		}
	}
	public static void exibeMenorNota(double[] medias,String[][] boletin) {
		if(medias[0]<medias[1] || medias[0]<medias[2]){
			
			System.out.println("O Aluno "+boletin[0][0]+" teve a menor media e foi "+medias[0]);
			
		}else if(medias[1]<medias[2]){
			
			System.out.println("O Aluno "+boletin[0][1]+" teve a menor media e foi "+medias[1]);
			
		}else{
			
			System.out.println("O Aluno "+boletin[0][2]+" teve a menor media e foi "+medias[2]);
			
		}
	}

}
