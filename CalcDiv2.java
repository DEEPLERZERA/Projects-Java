//CalcDiv2.java
import java.io.*;

class CalcDiv2
{
public static void main(String args[])
{
try {
   BufferedReader Teclado2 = new BufferedReader(new InputStreamReader(System.in));
   float X,Y, Z=0;
   System.out.println("Digite valor de X: ");
   X= Float.parseFloat( Teclado2.readLine());
   System.out.println("Digite valor de Y:");
   Y= Float.parseFloat( Teclado2.readLine());
     if(Y==0)
     {
         System.out.println("Erro! div por zero");
	 }
         else
         {
         Z=X/Y;
         System.out.println(X+" / "+Y +" = " + Z);
         }
	 }

         catch(Exception Erro)
         {
         System.out.println("Erro na Entrada de dados");
         }
         }
         }
