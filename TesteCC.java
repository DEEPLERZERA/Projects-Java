//ContaCorrente.java

class ContaCorrente
   {
      private int ContaCorrente;
      private String NomeCliente;
      private float Saldo;
      public void setSaldo(float S)

        {
        if(S!=0)
         Saldo=S;
       else
         System.out.println("ERRO ao setar/passar o saldo!");
         }
      public void setNomeCliente(String nom)
      {
        if(nom!="")
          NomeCliente=nom;
        else
          System.out.println("ERRO ao setar/passar o nome!");
          }
      public void setContaCorrente(int CC)
      {
         if(CC!=0)
            ContaCorrente=CC;
         else
           System.out.println("ERRO ao setar/passar a CC!");
           }
      public void Exibe()
      {
      System.out.println("Nome Cliente:"+NomeCliente);
      System.out.println("Conta Corrente:"+ContaCorrente);
      System.out.println("Saldo:"+Saldo);
		}
	}

//TesteCC.java

class TesteCC
{
static ContaCorrente Teste;

public static void main(String args[])
{
//ContaCorrente Teste;

 Teste=new ContaCorrente();
 Teste.NomeCliente="Jair";

 //Teste.ContaCorrente=1111;
 //Teste.Saldo=2000;
 //Teste.setNomeCliente("Jair");

   Teste.setContaCorrente(1111);
   Teste.setSaldo(2000);
  //System.out.println(Teste.NomeCliente);
  //System.out.println(Teste.ContaCorrente);
  //System.out.println(Teste.Saldo);
     System.out.println("Exibir usando metodo Exibe()");
       Teste.Exibe();
       }
       }