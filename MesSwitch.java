package estruturaCondicional;

import java.util.Scanner;

public class MesSwitch {

	public static void main(String[] args) {
	     
		Scanner ler = new Scanner(System.in);
		int mes;
		
		System.out.println("Digite um número correspondente à um mês");
		mes = ler.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("O número que você digitou é correspondente ao mês de Janeiro");
			break;
		
		case 2:
			System.out.println("O número que você digitou é correspondente ao mês de Fevereiro");
			break;
		
		case 3:
			System.out.println("O número que você digitou é correspondente ao mês de Março");
			break;
		
		case 4:
			System.out.println("O número que você digitou é correspondente ao mês de Abril");
			break;
		
		case 5:
			System.out.println("O número que você digitou é correspondente ao mês de Maio");
			break;
		
		case 6:
			System.out.println("O número que você digitou é correspondente ao mês de Junho");
			break;
		
		case 7:
			System.out.println("O número que você digitou é correspondente ao mês de Julho");
			break;
		
		case 8:
			System.out.println("O número que você digitou é correspondente ao mês de Agosto");
			break;
			
		case 9:
			System.out.println("O número que você digitou é correspondente ao mês de Setembro");
			break;
		
		case 10:
			System.out.println("O número que você digitou é correspondente ao mês de Outubro");
			break;
			
		case 11:
			System.out.println("O número que você digitou é correspondente ao mês de Novembro");
			break;
			
		case 12:
			System.out.println("O número que você digitou é correspondente ao mês de Dezembro");
			break;
		
			default:
				System.out.println("Número inválido, digite um número de 1 a 12");
			
		}

	}

}
