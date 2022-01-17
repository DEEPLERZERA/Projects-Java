//carro.java

class carro

{

String Modelo;
int Ano;
double Preco;
carro()
{

Modelo="Civic";

Ano= 2000;

Preco= 25000.00;

}

carro(String M,int A,double P)

{

	Modelo = M;
	Ano = A;
	Preco = P;

}
public void ExibeCarro()
{
	System.out.println(Modelo+" "+Ano+" "+Preco);
}}

//UsaCarro.java
class UsaCarro

{
	public static void main(String args[])
	{
		carro C1,C2,C3;

		C1=new carro();
		C2=new carro();
		C3= new carro("Celta",2004,18000.00);
		C2.Modelo="Corolla";
		C2.Ano=2002;
		C2.Preco=35000.00;
		System.out.println("Mostra carros");
		C1.ExibeCarro();
		C2.ExibeCarro();
		C3.ExibeCarro();
	}}
