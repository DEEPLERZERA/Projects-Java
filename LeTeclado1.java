//LeTeclado.java
import java.io.*;

class LeTeclado1
{
static DataInputStream LeTcl;
static String DadoLido;

   public static void main(String args[]) throws IOException
   {
   LeTcl=new DataInputStream(System.in); //inst�ncia do objeto LeTcl
   System.out.println("Digite um texto qualquer:");
   DadoLido = LeTcl.readLine();   //Objeto LeTcl chama o m�todo readline() da biblioteca/pacote java.io
   System.out.println("Voce digitou: " + DadoLido);
   }
   }