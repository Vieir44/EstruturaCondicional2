package estruturaCondicional;

import java.util.Scanner;

public class Saque {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final String cpf = "4759048861";
		
		String CPF;
		
		double salario, valor;
		
		int senha1, senha = 12345678;
		
		salario = 2000;
		
		System.out.println("Digite o seu CPF");
		CPF = ler.nextLine();
		
		System.out.println("Digite a sua senha");
		senha1 = ler.nextInt();
		
		if(cpf.equals(CPF) && senha1 == senha) {
			System.out.println("Seja Bem-Vindo");
			System.out.println("Digite o valor do Saque");
			valor = ler.nextDouble();
			if(valor > salario) {
				System.out.println("Esse valor não pode ser sacado");
			}else {
				System.out.println("Saque efetuado");
			
		}
		}else {
			System.out.println("Login inválido");
		
		
		

	}
		ler.close();

}
}
