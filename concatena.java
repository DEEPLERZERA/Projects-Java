//Concatena.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class concatena extends JFrame implements ActionListener
{
   JLabel L1,L2,L3;
   JTextField TF1,TF2,TF3;
   JButton B1,B2,B3;

   concatena()   //metodo  Construtora
   {
   setTitle("Concatena");
   setSize(600,200);
   setLocation(400,150);
   setResizable(true);
   getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
   getContentPane().setBackground(Color.cyan);
   L1 = new JLabel("Digite seu primeiro nome: ");
   L1.setForeground(Color.red);
   L2 = new JLabel("Digite seu sobrenome: ");
   L2.setForeground(Color.blue);
   L3 = new JLabel("Seu nome completo ");
   TF1 = new JTextField(15);
   TF2 = new JTextField(15);
   TF3 = new JTextField(15);
   B1 = new JButton("Concatenar");
   B2 = new JButton("Limpar");
   B3 = new JButton("Sair");
   B1.addActionListener(this);
   B2.addActionListener(this);
   B3.addActionListener(this);
   getContentPane().add(L1);getContentPane().add(TF1);
   getContentPane().add(L2);getContentPane().add(TF2);
   getContentPane().add(L3);getContentPane().add(TF3);
   getContentPane().add(B1);
   getContentPane().add(B2);
   getContentPane().add(B3);
   }
   public static void main(String args[])
   {
       JFrame JanelaApp = new concatena();
       JanelaApp.setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
      if(e.getSource()==B3)
         System.exit(0);
         if(e.getSource()==B2) {
           TF1.setText("     ");TF2.setText("      ");TF3.setText("       ");
              return;
		  }
         if(e.getSource()==B1)
         {
            String P1,P2,PC;
            P1 = TF1.getText();
            P2 = TF2.getText();
            PC = P1 + " " + P2;
            TF3.setText(" " + PC);
		}
} }