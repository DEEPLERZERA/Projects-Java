//Empresa.java

import java.io.*;

class Empresa                        //cria classe do programa
{

  int id;                            //cria variavel id no programa
  String Nome;                       //cria variavel Nome no programa
  String CNPJ;                        //cria variavel CNPJ no programa
  String Email;                         //cria variavel Email no programa
  public static void main(String args[])    //declara public static void main dando inicio ao programa
  {
    Empresa emp=new Empresa();           //linha que instancia o objeto emp
    emp.id=1111;                         //atribuindo valores a variavel id
    emp.Nome="FitoCreche";                //atribuindo valores a variavel Nome
    emp.CNPJ="101010101";                //atribuindo valores a variavel CNPJ
    emp.Email="creche@fito.br";          //atribuindo valores a variavel Email
    System.out.println("id: "+emp.id);         //daqui pra frente estamos apenas imprimindo na tela
    System.out.println("Nome: "+emp.Nome);
    System.out.println("CNPJ: "+emp.CNPJ);
    System.out.println("Email: "+emp.Email);
    }
    }