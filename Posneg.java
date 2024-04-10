package estruturaCondicional;

import java.util.Scanner;

public class Posneg {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		if(numero <0) {
			System.out.println("O número digitado é negativo");
		
		}else if(numero >0) {
			System.out.println("O número digitado é positivo");
		
		}else if(numero ==0) {
			System.out.println("O número digitado é igual a zero");
		}
		
		
        ler.close();
	}

}
