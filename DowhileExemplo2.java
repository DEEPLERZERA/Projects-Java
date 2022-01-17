public class DowhileExemplo2 {
     public static void main(String args[]) {
           int r = 0;
           
           do {
                System.out.println("Valor Aleatorio (randomico): " +  Math.random()*r);
                r++;
                }
                while(r <=10);
                System.out.println("Total acumulado: " + r);
                   }
                }