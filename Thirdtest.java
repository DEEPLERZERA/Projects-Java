//Thirdtest.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class Thirdtest {

  public static void main(String args[]) {
     float SP = 6783643 , RJ = 3667866 , MG = 2922988 , ES = 2716548 , outros = 1984953 , total = 0, perSP = 0, perRJ = 0, perMG = 0, perES = 0, peroutros = 0;

     total = SP + RJ + MG + ES + outros;


     perSP = SP * 100/total;
     perRJ = RJ * 100/total;
     perMG = MG * 100/total;
     perES = ES * 100/total;
     peroutros = outros * 100/total;
     System.out.println("Percentual SP: " + perSP);
     System.out.println("Percentual RJ: " + perRJ);
     System.out.println("Percentual MG: " + perMG);
     System.out.println("Percentual ES: " + perES);
     System.out.println("Percentual outros: " + peroutros);


}

}