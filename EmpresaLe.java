//EmpresaLe.java

import java.io.*;

class EmpresaLe
{
static DataInputStream LeTcl;
static String Nome;
static String Id;
static String CNPJ;
static String Email;

public static void main(String args[]) throws IOException

{
  LeTcl = new DataInputStream(System.in);
 System.out.println("\nDigite seu ID:");
  Id = LeTcl.readLine();
   System.out.println("\nDigite seu nome:");
   Nome = LeTcl.readLine();
   System.out.println("\nDigite seu CNPJ:");
   CNPJ = LeTcl.readLine();
   System.out.println("\nDigite seu Email:");
   Email = LeTcl.readLine();
   System.out.println("id: " + Id);
   System.out.println("Nome: " + Nome);
   System.out.println("CNPJ: " + CNPJ);
   System.out.println("Email: " + Email);
   }
   }
