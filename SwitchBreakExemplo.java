public class SwitchBreakExemplo {
   public static void main(String args[]) {
       char indice = 'b';
          String resultado = "";
            switch(indice) {
               case 'a':
               resultado += 'a';
               break;
               
               case 'b':
               resultado += 'b';
               break;
               
               case 'c':
               resultado += 'c';
               break;
               default:
               resultado += 'd';
               }
               System.out.println(resultado);
                }
               }