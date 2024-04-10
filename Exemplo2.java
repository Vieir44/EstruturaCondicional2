package estruturaCondicional;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	    int dia;
	    System.out.println("Informe o dia da semana");
	    dia = ler.nextInt();
	    
	    switch (dia) {
	    case 1:
	    	System.out.println("Domingo");
	    	break;
	    case 2:
	    	System.out.print("Segunda-Feira");
	        break;
	    case 3:
	    	System.out.println("Terça-Feira");
	    	break;
	    case 4:
	    	System.out.println("Quarta-Feira");
	    	break;
	    case 5:
	    	System.out.println("Quinta-Feira");
	    	break;
	    case 6:
	    	System.out.println("Sexta-Feira");
	    	break;
	    case 7:
	    	System.out.println("Sábado");
	    	break;
	    	
	    	default:
	    		System.out.println("Dia inválido");
	   
	    }
	
		

	}

}
