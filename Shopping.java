import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

import java.awt.BorderLayout;


class Shopping extends JFrame

{

 int x,p;

 float cost;

 String list[]={"none","Samsung Galaxy S7 Edge","OnePlus 3","LG G5","HTC 10","Xiaomi Mi5","Huawei P9","\nClear shopping cart"};

 JComboBox<String> box=new JComboBox<String>(list);

 JPanel upperPanel=new JPanel(new BorderLayout());

 JTextField heading=new JTextField("\t    Purchase List");

 JPanel lowerPanel=new JPanel(new BorderLayout());

 JTextArea costBox=new JTextArea();

 JTextArea textarea=new JTextArea();

 JButton payment=new JButton("Pay");

 Shopping()

 {

  cost=0;

  setSize(400,600);

  setLocationRelativeTo(null);

  setLayout(new BorderLayout(5,10));

  setTitle("Latest SmartPhones...");

  box.addActionListener(new ActionListener()  
  {  
   
public void actionPerformed(ActionEvent e)

   {

    x=box.getSelectedIndex();

    switch(x)

    { 
	case 0: break;

	case 1: cost+=50900;

		textarea.append("\n\tGalaxy note 7 :   50,900");

		break;

	case 2: cost+=27999;

		textarea.append("\n\tOnePlus 3      :   27,999");

		break;

	case 3: cost+=40990;

		textarea.append("\n\tLG G5\t:   40,990");

		break;

	case 4: cost+=46499;

		textarea.append("\n\tHTC 10\t:   46,499");

		break;

	case 5: cost+=22999;

		textarea.append("\n\tXiaomi Mi5      :   22,999");

		break;

	case 6: cost+=39999;

		textarea.append("\n\tHuawei P9      :   39,999");

		break;

	case 7: cost=0;
	textarea.setText("");

     }


     costBox.setText("\tTotal Cost\t\t:  "+cost+"\n\tInclusion of Tax 3%\t:  "+(cost*0.03)+"\n\tAmount Payable\t:  "+(cost+(cost*0.03)));


     }
});

     upperPanel.add(box,BorderLayout.NORTH);

     Font f=new Font("Times New Roman",Font.BOLD+Font.ITALIC,16);

     heading.setFont(f);

     heading.setEditable(false);

     upperPanel.add(heading,BorderLayout.CENTER);

     add(upperPanel,BorderLayout.NORTH);

     textarea.setEditable(false);

     add(textarea,BorderLayout.CENTER);

     costBox.setEditable(false);

     lowerPanel.add(costBox,BorderLayout.NORTH);

     payment.addActionListener(new ActionListener(){

     public void actionPerformed(ActionEvent e)

     {

	p=JOptionPane.showConfirmDialog(null,"Confirm your Payment of "+(cost+(cost*0.03))+" Rupees?","Payment Gateway",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

	if(p==JOptionPane.YES_OPTION)

	  JOptionPane.showMessageDialog(null,"Payment Successful");

	else
 	
if(p==JOptionPane.NO_OPTION)

	  JOptionPane.showMessageDialog(null,"Payment Aborted!");

     }
}
);

     lowerPanel.add(payment,BorderLayout.SOUTH);

     add(lowerPanel,BorderLayout.SOUTH);

     setVisible(true);

     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }

     public static void main(String[] args)

     {

      Shopping obj=new Shopping();

     }

}
