//prototype.java

import java.io.*;

class prototype
{
 static LeTel DadoLido; //DadoLido = objeto
  static Ngrupobib Nomes;

  public static void main(String args[]) throws IOException
  {
  System.out.println("PROTOTYPE DAS ESCOLHAS");
    System.out.println("\n1-AULA DA MAZÉ:");
    System.out.println("\n2-AULA DO JARED:");
    System.out.println("\n3-AULA DO RUBENS:");
    System.out.println("\n4-Sair");
    System.out.println("\n\n-Qual opcao?");
  int op=Integer.parseInt(DadoLido.LeTeclado());

  switch(op)
  {
  case 1:
  {
  System.out.println("SE FUDEU!!!!! COM CAMÕES KKKK");
    break;
    }

  case 2:
  {
  System.out.println("TOMA CUIDADO COM O TOBA!!!!!!");
     break;
     }

   case 3:
   {
   System.out.println("A MOLÉCULA DA BIOLANGE É ESPECIAL PRA ELE!!!!");
     break;
     }
     case 4:
      System.out.println("\nEstou saindo....");
  break;
    default:
	  System.out.println("\nOpcao invalido!!!!");
	  }
	  Nomes.Ngrupobib();
	  }
  }
