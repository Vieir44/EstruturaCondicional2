package estruturaCondicional;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args)
	
	{
		
		Scanner ler = new Scanner(System.in);
	
		
		System.out.println("Escolha um número de 1 a 3: ");
		int numero = ler.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("O número escolhido foi 1");
			break;
		case 2:
			System.out.println("O número escolhido foi 2");
			break;
		case 3:
			System.out.println("O número escolhido foi 3");
			break;
		default:
			System.out.println("O número escolhido é inválido, o número deve ser de 1 a 3");
			break;
		
		
		   
			
		}

	}

}