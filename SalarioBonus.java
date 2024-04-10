package estruturaCondicional;

import java.util.Scanner;

public class SalarioBonus {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Double salario, tempo;
		
		
		
		System.out.println("Informe o valor atual do seu salário ");
		salario = ler.nextDouble();
		
        System.out.println("Agora informe o seu número de anos na empresa");
        tempo = ler.nextDouble();
        
        if (tempo <= 3) {
        	System.out.println("O seu salário sofrerá um aumento de 5% ");
        }
        	
        	
        	else if (tempo > 3) {
        		System.out.println("O seu salário sofrerá um aumento de 7% ");
   
        		
        		
        	}
        }
	}
