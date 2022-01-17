//ExJW1Alo.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ExJW1Alo extends JFrame implements ActionListener
{
	JButton B1, B2, B3;
	JTextField TF;
 public static void main(String args[])
 {
	 JFrame JExAlo = new ExJW1Alo();
	 JExAlo.setVisible(true);
 }

 ExJW1Alo()
 {
	 setTitle("Java-2Sistemas/Internet");
	 setSize(300,250);
	 setLocation(500,300);
	 setResizable(true);

	 TF = new JTextField (20);
	 TF.setBackground(Color.cyan);
	 TF.setForeground(Color.red);
	    B3 = new JButton("Sair");
	    B3.addActionListener(this);
	    B2 = new JButton("Limpar");
	    B2.addActionListener(this);
	    B1 = new JButton("Alo");
	    B1.addActionListener(this);
	    getContentPane().setLayout(new GridLayout(5,1));
	    getContentPane().add(B1);
	    getContentPane().add(B2);
	    getContentPane().add(B3);
	    getContentPane().add(TF);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==B3)
		System.exit(0);


	   if(e.getSource()==B2)
	   TF.setText("   ");


   if(e.getSource()==B1)
        TF.setText("Alo Fito – 2º Sistemas/Internet -2020");
 }
}



