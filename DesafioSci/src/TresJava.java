import java.util.Scanner;

public class TresJava {
	
	public static void main(String[] args) {
		/*
		   Elabore um programa de computador que realize o cálculo de notas.
		   Este programa deverá solicitar o nome do aluno e quatro notas,
		   todo este conjunto deverá estar contido em um laço que confirme
		   se deseja encerrar o programa ou continuar solicitando outros nomes e notas.
           Ao final da solicitação do nome e das notas deverá ser impresso o nome do 
           aluno e a sua média, se a nota for  menor que 6 imprimir Reprovado, senão,
            se a nota for igual ou maior que 6, imprimir Aprovado.
		 */
		Scanner scan = new Scanner(System.in);
		String nomeDoAluno = "";
		double mediaDoAluno;
		boolean executarNovamente = true;
		do {
		mediaDoAluno = 0.0;
		System.out.println("Informe o seu nome");
		nomeDoAluno = scan.next();
		for (int i = 0; i < 4; i++) {
			System.out.println("Informe a "+(i+1)+"º nota");
			mediaDoAluno += scan.nextDouble();
		}
		if((mediaDoAluno/4)<6) {
			System.out.println("O aluno "+nomeDoAluno+" reprovado, media "+(mediaDoAluno/4));
		}else {
		   System.out.println("O aluno "+nomeDoAluno+" aprovado, media "+(mediaDoAluno/4));
		}
		System.out.println("Deseja fazer um novo cálculo?\nNao\nSim");
		
		if(scan.next().equalsIgnoreCase("nao")) {
			executarNovamente=false;
		}
		
		}while(executarNovamente);
		scan.close();
	}
}
