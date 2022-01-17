//OperArit.java
import java.io.*;

class OperArit
{
  public static void main (String args[])
        {
          float a=10, b=25, c=40, d=5;
  System.out.println ("\nOperadores Aritmeticos com Numeros Reais:");
   System.out.println (a + " + " + b + " = " +(a+b));
   System.out.println (a + " - " +b+ " = " + (a-b));
   System.out.println (a+ " * " +b+ " = "+ (a*b));
   System.out.println (b + " / " +a+ " = " + (b/a));
   System.out.println ("Resto = " + b + " % " +a+ " = " + (b%a));
   System.out.println ("\nOperadores Aritmeticos de Atribuicao Reduzidos:");
   System.out.println (c+" += "+d+ " -> " + (c+d));
   System.out.println (c+" -= "+d+ " -> " + (c-d));
   System.out.println (c+" *= "+d+ " -> " + (c*d));
   System.out.println (c+" /= "+d+ " -> " + (c/d));
 System.out.println ("Resto = "+c+" %= "+d+ "->" + (c%d));
	}
}
