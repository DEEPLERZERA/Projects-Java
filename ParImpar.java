//ex11_le um numero inteiro e verifica se é par ou impar
//parImpar.java

import java.io.*;

class ParImpar
{
public static void main(String args[]) throws IOException
{
int N,Resto;
BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
String message;
System.out.println("Programa par-impar:");
System.out.println("Digite um numero inteiro qualquer:");
message = stdin.readLine();
N = Integer.parseInt(message);
  Resto=N%2;
  if(Resto==1)
    System.out.println("N="+N +" é Impar");
    else
    System.out.println("N="+N +" é par");
    }}
