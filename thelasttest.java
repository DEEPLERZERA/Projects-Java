//thelasttest.java
import javax.swing.JOptionPane;

    public class thelasttest {
        public static void main(String args[])   //Criando o estado publico do programa
        {
            char vetor[];  //definindo o vetor
            String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");  //Recebendo input do usuário
		    String fraseInvertida = new StringBuilder(frase).reverse().toString(); //Invertendo frase
            System.out.println(fraseInvertida);  //Imprimindo na tela
        }
    }