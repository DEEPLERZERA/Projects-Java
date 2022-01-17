//ExTabuada.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class ExTabuada extends JFrame implements ActionListener
{
	JLabel L1;
	JButton B1, B2, B3;
	JTextField T1;
	JTextArea TA1;

 public static void main(String args[])
 {
	 JFrame JExTabuada = new ExTabuada();
	 JExTabuada.setVisible(true);
 }

 ExTabuada()
 {
	 setTitle("ExTabuada");
	 setSize(350,300);
	 setLocation(50,50);
	 setResizable(false);
	 getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
	 L1 = new JLabel("Digite um numero int: ");
	 L1.setForeground(Color.red);
	 L1.setFont(new Font("",Font.BOLD,14));
	 B1 = new JButton("Tabuada");
	 B1.addActionListener(this);
     B1.setFont(new Font("",Font.BOLD,18));
	 B2 = new JButton("Limpar");
	 B2.addActionListener(this);
	 B2.setFont(new Font("",Font.BOLD,18));
	 B3 = new JButton("Sair");
	 B3.addActionListener(this);
	 B3.setFont(new Font("",Font.BOLD,18));
	 TA1 = new JTextArea (10,15);
	 T1 = new JTextField(10);

	 JScrollPane painel1 = new JScrollPane(TA1);


	 getContentPane().setBackground(Color.cyan);
	 getContentPane().add(L1);getContentPane().add(T1);
	 getContentPane().add(B1);getContentPane().add(B2);getContentPane().add(B3);
	 getContentPane().add(painel1);


		}
		public void actionPerformed(ActionEvent e)
		{
			float N1,i=0;
			if(e.getSource()==B3)
			{
				System.exit(0);
			}

			N1 = Float.parseFloat(T1.getText());
			  if(e.getSource()==B1) {
			      for(i = 0;i<=10;i++ ) {
					   TA1.append(N1 + "*" +  i  + "  = "  +  N1*i + "\n");

				  }
			  }
			  if(e.getSource()==B2){
				   TA1.setText(" ");
				   T1.setText("  ");
			  }

			}


			}





