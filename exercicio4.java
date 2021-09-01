package lacosdedesicao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x;
		
		Scanner leia= new Scanner (System.in);
		
		System.out.println("\n digite um número qualquer");
		x=leia.nextFloat();
		
		if (x%2==0)
		{
			System.out.println("\n par:"+x);
		}
		else
		{
			System.out.println("\n impar"+x);
		}
		
	}

}
