package lacosdedesicao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		
		Scanner leia= new Scanner (System.in); 
		
		System.out.println("\n digite sua idade:");
		idade= leia.nextInt();
	
	    if(idade>0 && idade<10)
		{
		System.out.println("\n dente de leite \t"+idade);
		}
		if(idade>=10 && idade<=14)
		{
			System.out.println("\n infantil \t"+idade);
		}
		if (idade>=15 && idade<=17)
		{
			System.out.println("\n juvenil \t"+idade);
		}
		if (idade>=18 && idade<+25)
		{
			System.out.println("\n adulto \t"+idade);
		}
		else if (idade>25)
		{
			System.out.println("\n senior \t"+idade);
		}
	}

}
