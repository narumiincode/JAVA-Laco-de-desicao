package lacosdedesicao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int x,y,z;
				
		Scanner leia= new Scanner (System.in);{

		System.out.println("\n digite um n�mero: \t");
		x = leia.nextInt();

		System.out.println("\n digite um n�mero: \t");
		y = leia.nextInt();

		System.out.println("\n digite um n�mero: \t");
		z =leia.nextInt();
		

		if (x>y && x>z)
		{
			System.out.printf("\n o maior n�mero �: \t"+x);
		}

		else if (y>z && y>x)
		{
			System.out.printf("\n o maior n�mero �: \t"+y);
		}
		else 
		{
			System.out.printf("\n o maior n�mero �: \t"+z);
			}
	    }

	}
	}


