
import java.util.Scanner;

public class CincoJava {

	/*
	 5 - Crie uma matriz bidimensional. Deverá ser solicitado
	  três nomes de alunos e quatro notas, após solicitação dos
	   nomes e das notas deverá ser impresso os nomes acompanhados 
	   da média geral de cada aluno, deverá ser impresso também o nome 
	   do aluno que obteve a maior média e o nome do aluno que obteve a menor média.

	 */
	public static void main(String[] args) {
		double mediaCalculada = 0.0;
		double notaAtual = 0.0;
		double[] medias = new double[3];
		String[][] boletim = new String[6][3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			mediaCalculada=0.0;
			System.out.println("Informe o nome do aluno");
			boletim[0][i] = scan.next();
			for (int j = 1; j < 5; j++) {
				System.out.println("Informe sua nota");
				notaAtual =  scan.nextDouble();
				mediaCalculada += notaAtual;
				boletim[j][i] = String.valueOf(notaAtual); 
			}
			medias[i] = mediaCalculada/4;
			boletim[5][i] = String.valueOf(mediaCalculada/4);
		}
		exibeMediasComNome(boletim);
		exibeMaiorNota(medias, boletim);
		exibeMenorNota(medias, boletim);
		scan.close();
	}

	public static void exibeMediasComNome(String[][] boletim) {
		for (int i = 0; i < 3; i++) {
			System.out.println("O aluno "+boletim[0][i]+" tirou a media "+boletim[5][i]);
		}
	}
	public static void exibeMaiorNota(double[] medias,String[][] boletim) {
		if(medias[0]>medias[1] || medias[0]>medias[2]){
			
			System.out.println("O Aluno "+boletim[0][0]+" teve a maior media e foi "+medias[0]);
			
		}else if(medias[1]>medias[2]){
			
			System.out.println("O Aluno "+boletim[0][1]+" teve a maior media e foi "+medias[1]);
			
		}else{
			
			System.out.println("O Aluno "+boletim[0][2]+" teve a maior media e foi "+medias[2]);
			
		}
	}
	public static void exibeMenorNota(double[] medias,String[][] boletim) {
		if(medias[0]<medias[1] || medias[0]<medias[2]){
			
			System.out.println("O Aluno "+boletim[0][0]+" teve a menor media e foi "+medias[0]);
			
		}else if(medias[1]<medias[2]){
			
			System.out.println("O Aluno "+boletim[0][1]+" teve a menor media e foi "+medias[1]);
			
		}else{
			
			System.out.println("O Aluno "+boletim[0][2]+" teve a menor media e foi "+medias[2]);
			
		}
	}

}
