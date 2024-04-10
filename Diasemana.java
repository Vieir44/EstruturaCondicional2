package estruturaCondicional;

import java.util.Scanner;

public class Diasemana {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int dia;

		System.out.println("Digite o número correspondente ao dia da semana: ");
		dia = ler.nextInt();

		if(dia == 1) {
			System.out.println("O número corresponde a segunda feira");
		}else if(dia == 2) {
			System.out.println("O número corresponde a terça feira");
		}else if(dia == 3) {
			System.out.println("O número corresponde a quarta feira");
		}else if (dia == 4) {
			System.out.println("O número corresponde a quinta feira");
		}else if (dia == 5) {
				System.out.println("O número corresponde a sexta feira");
		}else if (dia == 6) {
			System.out.println("O número corresponde a sábado");
		}else if(dia == 7) {
			System.out.println("O número corresponde a domingo");
		}else {
			System.out.println("Dia inválido");
		ler.close();
		}
			
		}
		}
			
		
	

