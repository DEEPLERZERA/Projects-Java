//pai.java

class Pai
{
int ano=2005;
String curso="Fac_-Fito-Ciência da Computação";
    }
    class Filha extends Pai
    {
    int ano=4;
    String disciplina="Linguagem de Programação";
    void mostra()
    {
    System.out.println("Classe Pai:"+super.ano);
    System.out.println("Classe pai curso: "+curso);
    System.out.println();
    System.out.println("Classe Filha ano:"+ano);
    System.out.println("Classe Filha disciplina: "+disciplina);
    }}

    class TesteHer
    {
		public static void main(String args[])
		{
			Filha aluno=new Filha();
			aluno.mostra(); }}