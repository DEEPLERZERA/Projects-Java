//MF.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class MF extends JFrame implements ActionListener
{
	JLabel L1, L2 ,L3, L4, L5, L6, L7, L8;
	JButton B1, B2, B3;
	JTextField T1,T2,T3,T4,T5,T6,T7,T8,T9;

 public static void main(String args[])
 {
	 JFrame JMF = new MF();
	 JMF.setVisible(true);
 }

 MF()
 {
	 setTitle("Média Final Anual");
	 setSize(400,180);
	 setLocation(500,200);
	 L1 = new JLabel("Turma:");
	 L1.setForeground(Color.black);
	 L1.setFont(new Font("",Font.BOLD,14));
	 L2 = new JLabel("N:");
	 L2.setForeground(Color.black);
	 L2.setFont(new Font("",Font.BOLD,14));
	 L3 = new JLabel("NT1:");
	 L3.setForeground(Color.black);
	 L3.setFont(new Font("",Font.BOLD,14));
	 L4 = new JLabel("NT3:");
	 L4.setForeground(Color.black);
	 L4.setFont(new Font("",Font.BOLD,14));
	 L5 = new JLabel("Disciplina:");
	 L5.setForeground(Color.black);
	 L5.setFont(new Font("",Font.BOLD,14));
	 L6 = new JLabel("Nome:");
	 L6.setForeground(Color.black);
	 L6.setFont(new Font("",Font.BOLD,14));
	 L7 = new JLabel("NT2:");
	 L7.setForeground(Color.black);
	 L7.setFont(new Font("",Font.BOLD,14));
	 L8 = new JLabel("MF:");
	 L8.setForeground(Color.black);
	 L8.setFont(new Font("",Font.BOLD,14));
	 B1 = new JButton("Calcular");
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
	 T3 = new JTextField();
	 T4 = new JTextField();
	 T5 = new JTextField();
	 T6 = new JTextField();
	 T7 = new JTextField();
	 T8 = new JTextField();
	 T9 = new JTextField();
	 T9.setEditable(false);


	 getContentPane().setBackground(Color.cyan);
	 getContentPane().setLayout(new GridLayout(5,4));
	 getContentPane().add(L1);getContentPane().add(T1);getContentPane().add(L5);getContentPane().add(T2);
	 getContentPane().add(L2);getContentPane().add(T3);getContentPane().add(L6);getContentPane().add(T4);
	 getContentPane().add(L3);getContentPane().add(T5);getContentPane().add(L7);getContentPane().add(T6);
	 getContentPane().add(L4);getContentPane().add(T7);getContentPane().add(L8);getContentPane().add(T8);
	 getContentPane().add(T9);getContentPane().add(B1);getContentPane().add(B2);getContentPane().add(B3);

		}
		public void actionPerformed(ActionEvent e)
		{
			float N1 = 0 , N2 = 0, N3 = 0, MF = 0;
			if(e.getSource()==B2)
			{
				T1.setText("");T2.setText("");T3.setText("");T4.setText("");T5.setText("");T6.setText("");T7.setText("");T8.setText("");T9.setText("");
				return;
			}
			if(e.getSource()==B3) {
			System.exit(0);
			}

			N1 = Float.parseFloat(T5.getText());
			N2 = Float.parseFloat(T7.getText());
			N3 = Float.parseFloat(T6.getText());
			  if(e.getSource()==B1) {
			  MF = ((N1*3)+(N2*3)+(N3*4))/10;
			   if(MF >=6.0) {
				   T9.setForeground(Color.blue);
				   T9.setText("Promovido!!");
				   T8.setText(""+MF);
			   }
			   else {
				   T9.setForeground(Color.red);
				   T9.setText("Retido!!!");
				   T8.setText(""+MF);
			   }

			}
		}


			}





