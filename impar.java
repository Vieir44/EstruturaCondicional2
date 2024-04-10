package estruturaCondicional;

import java.util.Scanner;

public class impar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 1) {
			System.out.println("O número digitado é ímpar");
		}else {
			System.out.println("O número digitado é par");
		}
         ler.close();
	}

}
