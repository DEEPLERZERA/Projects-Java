//ExCalcSoma.java

//CalcSoma

import java.io.*;

class CalcSoma
{
public static void main(String args[]) throws IOException
{
BufferedReader Teclado1 = new BufferedReader(new InputStreamReader(System.in));
  float A,B,C;
  System.out.println("Digite valor de X");
  A = Float.parseFloat(Teclado1.readLine());
  System.out.println("Digite valor de Y");
  B = Float.parseFloat(Teclado1.readLine());

   C= A+B;
   System.out.println(A+" + " +B +"=" + C);
   } }