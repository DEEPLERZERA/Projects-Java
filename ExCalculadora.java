//ExCalculadora.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class ExCalculadora extends JFrame implements ActionListener
{
	JLabel L1, L2 ,L3;
	JButton B1, B2, B3 ,B4 ,B5 ,B6;
	JTextField T1,T2,T3;

 public static void main(String args[])
 {
	 JFrame JExCalculadora = new ExCalculadora();
	 JExCalculadora.setVisible(true);
 }

 ExCalculadora()
 {
	 setTitle("ExCalculadora");
	 setSize(350,90);
	 setLocation(50,50);
	 L1 = new JLabel("Numero1: ");
	 L1.setForeground(Color.black);
	 L1.setFont(new Font("",Font.BOLD,14));
	 L2 = new JLabel("Numero2: ");
	 L2.setForeground(Color.red);
	 L2.setFont(new Font("",Font.BOLD,14));
	 L3 = new JLabel("Resultado");
	 L3.setForeground(Color.blue);
	 L3.setFont(new Font("",Font.BOLD,14));
	 B1 = new JButton("X");
	 B1.addActionListener(this);
     B1.setFont(new Font("",Font.BOLD,18));
	 B2 = new JButton("/");
	 B2.addActionListener(this);
	 B2.setFont(new Font("",Font.BOLD,18));
	 B4 = new JButton("+");
	 B4.addActionListener(this);
	 B4.setFont(new Font("",Font.BOLD,18));
	 B5 = new JButton("-");
	 B3 = new JButton("Limpar");
	 B3.addActionListener(this);
	 B5.addActionListener(this);
	 B5.setFont(new Font("",Font.BOLD,18));
	 B6 = new JButton("Sair");
	 B6.addActionListener(this);
	 T1 = new JTextField();
	 T2 = new JTextField();
	 T3 = new JTextField();
	 T3.setEditable(false);

	 getContentPane().setBackground(Color.cyan);
	 getContentPane().setLayout(new GridLayout(3,4));
	 getContentPane().add(L1);getContentPane().add(T1);getContentPane().add(B1);
	 getContentPane().add(B4);
	 getContentPane().add(L2);getContentPane().add(T2);getContentPane().add(B2);
	 getContentPane().add(B5);
	 getContentPane().add(L3);getContentPane().add(T3);getContentPane().add(B3);
	 getContentPane().add(B6);

		}
		public void actionPerformed(ActionEvent e)
		{
			float N1=0 ,N2=0, Result=0;
			if(e.getSource()==B3)
			{
				T1.setText("");T2.setText("");T3.setText("");
				return;
			}
			if(e.getSource()==B6)
			System.exit(0);

			N1 = Float.parseFloat(T1.getText());
			N2 = Float.parseFloat(T2.getText());
			  if(e.getSource()==B1)
			  Result = N1*N2;
			  if(e.getSource()==B2)
			    if(N2==0)
			    {
					T3.setText("Erro!Div por 0");
					return;
				} else {
					Result= N1/N2;
				}
				if(e.getSource()==B4)
				  Result = N1+N2;
				if(e.getSource()==B5)
				    Result = N1-N2;
				if(e.getSource()==B6)
				   System.exit(0);
	                T3.setText(""+Result);
			}


			}





