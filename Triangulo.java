package estruturaCondicional;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int base, altura, outrolado;
		
		System.out.println("Digite um número que será a medida da base de um Triângulo: ");
		base = ler.nextInt();
		
		System.out.println("AGora, digite a medida da altura: ");
		altura = ler.nextInt();
		
		System.out.println("E por último, digite a medida do terceiro lado do triângulo: ");
		outrolado = ler.nextInt();
		
		if(base == altura && altura == outrolado) {
			System.out.println("As medidas que você deu, é de um triângulo Equilátero");
		
		}else if(base != altura && altura != outrolado) {
			System.out.println("As medidas que você deu, é a de um triângulo escaleno");
			
		}else {
			System.out.println("As medidas que você deu, é a de um triângulo isósceles");
			
			ler.close();
		}
		
		
		

	}

}
