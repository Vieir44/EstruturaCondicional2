package estruturaCondicional;

import java.util.Scanner;

public class Notamed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double nota1, nota2, nota3, nota4, media;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a primeira nota de uma prova de Pedrinho: ");
		nota1 = ler.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = ler.nextDouble();
		System.out.println("Agora, a terceira nota: ");
		nota4 = ler.nextDouble();

		media = (nota1+nota2+nota3+nota4)/4;

		if(media >= 6 ) {
			System.out.println("A média de Pedrinho é: " + media + " Sendo uma nota aprovada");
		}
		else {
			System.out.println("A média de Pedrinho é: " + media + " Sendo uma nota reprovada");
		
		ler.close();
		}

	}

}
