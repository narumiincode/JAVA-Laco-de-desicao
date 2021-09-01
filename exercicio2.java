package lacosdedesicao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a,b,c;
		
		Scanner leia= new Scanner (System.in);
				
		System.out.println("\n digite um número:");
		a = leia.nextFloat();
		
		System.out.println("\n digite um número:");
		b = leia.nextFloat();
		
		System.out.println("\n digite um número:");
		c = leia.nextFloat();
				
	  if (a>=b && a>=c)
	  {
		  System.out.println("\n 1°:"+a);
	  }
	  if (b>=a && b>=c )
	  { 
		  System.out.println("\n 1°"+b);
	  }
	  if (c>=a && c>=b)
	  {
		  System.out.println("\n 1°:"+c);
	  }
	  if (a>=c && a<=b || a<=c && a>=b)
	  {
		  System.out.println("\n 2°:"+a);
	  }
	  if (b>=a && b<=c || b<=a && b>=c)
	  {
		  System.out.println("\n 2°:"+b);
	  }
	  if (c>=b && c<=a || c<=b && c>=a)
	  {
		  System.out.println("\n 2°:"+c);
	  }
	  if (a<=b && a<=c)
	  {
		  System.out.println("\n 3°:"+a);
	  }
	  if (b<=a && b<=c)
	  {
		  System.out.println("\n 3°:"+b);
	  }
	  if (c<=a && c<=b)
	  {
		  System.out.println("\n 3°:"+c);
	  }
	}
}
