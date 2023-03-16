import java.util.Scanner;

public class TresJava {
	
	public static void main(String[] args) {
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
