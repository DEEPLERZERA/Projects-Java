//ExAnoBi.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class ExAnoBi extends JFrame implements ActionListener
{
	JLabel L1;
	JButton B1, B2, B3;
	JTextField T1,T2;

 public static void main(String args[])
 {
	 JFrame JExAnoBi = new ExAnoBi();
	 JExAnoBi.setVisible(true);
 }

 ExAnoBi()
 {
	 setTitle("ExAnoBi");
	 setSize(800,300);
	 setLocation(50,50);
	 L1 = new JLabel("Digite o ano: ");
	 L1.setForeground(Color.black);
	 L1.setFont(new Font("",Font.BOLD,14));
	 B1 = new JButton("Verificar ano");
	 B1.addActionListener(this);
     B1.setFont(new Font("",Font.BOLD,18));
	 B2 = new JButton("Limpar");
	 B2.addActionListener(this);
	 B2.setFont(new Font("",Font.BOLD,18));
	 B3 = new JButton("Sair");
	 B3.addActionListener(this);
	 B3.setFont(new Font("",Font.BOLD,18));
	 T1 = new JTextField();
	 T2 = new JTextField();

	 getContentPane().setBackground(Color.cyan);
	 getContentPane().setLayout(new GridLayout(2,3));
	 getContentPane().add(L1);getContentPane().add(T1);getContentPane().add(T2);
	 getContentPane().add(B1);getContentPane().add(B2);getContentPane().add(B3);

		}
		public void actionPerformed(ActionEvent e)
		{
			float N1=0, Result=0;
			if(e.getSource()==B2)
			{
				T1.setText("");
				T2.setText("");
				return;
			}
			if(e.getSource()==B3)
			System.exit(0);

			N1 = Integer.parseInt(T1.getText());
			  if(e.getSource()==B1) {
			         if((N1%4 == 0) || (N1 % 400 == 0) && (N1 % 100 !=0)) {

				     	 T2.setForeground(Color.blue);
				     	 T2.setText("É bissexto!");

			         }
			         else {
						  T2.setText("Nao é bissexto!");
					 }



			 }

			}


			}





