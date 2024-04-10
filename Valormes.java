package estruturaCondicional;

import java.util.Scanner;

public class Valormes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int mes;

		System.out.println("Digite um número correspondente à um mês");
		mes = ler.nextInt();

		if(mes == 1) {
			System.out.println("O número corresponde ao mês de Janeiro");
		}else if(mes == 2) {
			System.out.println("O número corresponde ao mês de Fevereiro");
		}else if(mes == 3) {
			System.out.println("O número corresponde ao mês de Março");
		}else if(mes == 4) {
			System.out.println("O número corresponde ao m~es de Abril");
		}else if(mes == 5) {
			System.out.println("O número corresponde ao m~es de Maio");

		}else if(mes == 6) {
			System.out.println("O número corresponde ao m~es de Junho");
		}else if(mes == 7) {
			System.out.println("O número corresponde ao mês de Julho");
		}else if(mes == 8) {
			System.out.println("O número corresponde ao mês de Agosto");

		}else if(mes == 9) {
			System.out.println("O número corresponde ao mês de Setembro");
		}else if(mes == 10) {
			System.out.println("O número corresponde ao mês de Outubro");
		}else if(mes == 11) {
			System.out.println("O número corresponde ao mês de Novembro");
		}else if(mes == 12) {
			System.out.println("O número corresponde ao mês de Dezembro");
		} else {
			System.out.println("Dia inválido");
		}
        ler.close();
	}
}


