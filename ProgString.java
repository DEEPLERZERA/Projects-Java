public class ProgString {
     public static void main(String arg[]) {
         System.out.println("\n*** Recomenda-se não acentuar as palavras! ***");
         System.out.println("\n========================================================================");
         String v1 = "Sistema";
         String v2= new String("sistema");

         //equals
         System.out.println("Exemplo com o metodo de comparação: equals");
         if (v1.equals(v2))
         {
            System.out.println("variaveis identicas => " + " v1: "+ v1 + " v2: "+ v2);
            }
            else {
            System.out.println("variaveis Diferentes => " + " v1: "+ v1 + " v2: "+ v2);
            }

            System.out.println("\n========================================================");
            //equalsignoreCase
            System.out.println("Exemplo SEM o metodo de comparacao: equalsIgnoreCase");
            if(v1.equalsIgnoreCase(v2))
            {
               System.out.println("variaveis Identicas =>" + " v1: "+ v1 + " v2: "+ v2);
               }
               else {
               System.out.println("variaveis Diferentes =>" + " v1: "+ v1 + " v2: "+ v2);
               }
               System.out.println("\n====================================================");
               //Alguns metodos
               //indexof, charAt, substring
               System.out.println("Exemplos com metodos: indexOf, substring, charAt");
               String frase = "Desenvolvimento de Sistemas";
               System.out.println("\nFrase-Exemplo => Desenvolvimento de Sistemas");
               System.out.println("\nindexof => Posição da fonte <a> na Frase-Exemplo (0 a 26 e com os espaços): " + frase.charAt(5));


               System.out.println("\n=========================================================================");
               //concat
               String titulo1 = "Desenvolvimento ", titulo2 = "de Sistemas ";
               String cursoCompleto = titulo1.concat(titulo2);
               System.out.println("\ntitulo1: " + titulo1);
               System.out.println("titulo2: " + titulo2);
               System.out.println("Exemplo concatenado => titulo 1 + titulo 2 = " + cursoCompleto);
               }
               }