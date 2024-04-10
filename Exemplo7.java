package estruturaCondicional;

import java.util.Scanner;

public class Exemplo7 {

	public static void main(String[] args) {
		
		double a;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um valor ");
		a = ler.nextDouble();
		String msg = a % 5 == 0 ? " O número"  + a +  "É múltiplo de 5 " : "O número "  + a +  "Não é Múltiplo de 5 ";
        System.out.println(msg);
        ler.close();
	}

}
