//ExJW4.java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

class ExJW4 extends JFrame implements
ListSelectionListener,ActionListener
{

   JLabel L1;
   JTextField T1;
   JList lista;
   JButton Bquant,Bindice,Blimpar;
   DefaultListModel listModel;

   public static void main(String args[])
   {
   JFrame Janela = new ExJW4();
   Janela.setVisible(true);
       }

   ExJW4()
   {
   setTitle("JListbox-Cursos FITO");
   setSize(200,500);
   setLocation(300,100);
   T1 = new JTextField();
   T1.addActionListener(this);
   L1 = new JLabel("sem seleção:");
   L1.setForeground(Color.black);
   Bquant = new JButton("Quantidade de itens: ");
   Bquant.addActionListener(this);
   Bindice = new JButton("Indice selecionado: ");
   Bindice.addActionListener(this);
   Blimpar = new JButton("Remove item:");
   Blimpar.addActionListener(this);
   listModel = new DefaultListModel();
   listModel.addElement("Ensino Médio básico");
   listModel.addElement("Tecnico de Administração");
   listModel.addElement("Tecnico de Construção cívil");
   listModel.addElement("Tecnico em Des.Sistemas");
   listModel.addElement("tecnico em internet");


   lista = new JList(listModel);
   lista.addListSelectionListener(this);

   JScrollPane painel = new JScrollPane(lista);
   getContentPane().setLayout(new GridLayout(6,1));
   getContentPane().add(L1);
   getContentPane().add(T1);
   getContentPane().add(painel);
   getContentPane().add(Bquant);
   getContentPane().add(Bindice);
   getContentPane().add(Blimpar);
   }
   public void actionPerformed(ActionEvent e)
   {
     if(e.getSource()==T1)
     {
       listModel.addElement(T1.getText());
       T1.setText("");
       }

     if(e.getSource()==Bquant)
      T1.setText("Quantidade:"+ listModel.getSize());
      if(e.getSource()==Bindice)
        T1.setText("Indice Selecionado: "+ lista.getSelectedIndex());
        if(e.getSource()==Blimpar)
        {
         T1.setText("Removido:"+ lista.getSelectedValue());
           listModel.remove(lista.getSelectedIndex());
           }
           }

         public void valueChanged(ListSelectionEvent e)
         {
         L1.setText("Selecionado:"+ lista.getSelectedValue());
         }
         }