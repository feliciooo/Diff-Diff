import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public abstract class EventDriven_Rentura extends JFrame implements ActionListener {

   JFrame inputFrame = new JFrame();
   JFrame outputFrame = new JFrame();
   
   JPanel inputPanel = new JPanel();
   JPanel outputPanel = new JPanel();
   
   JTextField firstText = new JTextField(20);
   JLabel firstLabel = new JLabel("First Name: ");
   JLabel outputFirst = new JLabel();
   JTextArea outputArea = new JTextArea (10, 24);
   
   JTextField lastText = new JTextField(20);
   JLabel lastLabel = new JLabel("Last Name: ");
   JLabel outputLast = new JLabel();
   //JTextArea lastArea = new JTextArea (5, 15);
   
   JTextField middleText = new JTextField(20);
   JLabel middleLabel = new JLabel("Middle Name: ");
   JLabel outputMid = new JLabel();
   //JTextArea midArea = new JTextArea (5, 15);
   
   JTextField mobText = new JTextField(20);
   JLabel mobLabel = new JLabel("Mobile Number: ");
   JLabel outputMob = new JLabel();
   //JTextArea mobArea = new JTextArea (5, 15);
   
   JTextField emailText = new JTextField(20);
   JLabel emailLabel = new JLabel("Email Address: ");
   JLabel outputEmail = new JLabel();
   //JTextArea emailArea = new JTextArea (5, 15);
   
   JButton btnSubmit = new JButton("Submit");
   JButton btnClear = new JButton("Clear All");
   JButton btnOkay = new JButton("Okay");
   
   FlowLayout flow = new FlowLayout();
   Font setFont = new Font("", Font.BOLD, 12);
   
   public EventDriven_Rentura (){

    this.setSize(280, 350);
    this.setLocation(200, 200);
    this.setResizable(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    inputFrame.add(inputPanel);
    inputPanel.add(firstLabel);
    inputPanel.add(firstText);
    inputPanel.add(lastLabel);
    inputPanel.add(lastText);
    inputPanel.add(middleLabel);
    inputPanel.add(middleText);
    inputPanel.add(mobLabel);
    inputPanel.add(mobText);
    inputPanel.add(emailLabel);
    inputPanel.add(emailText);
    
    inputPanel.add(btnSubmit);
    btnSubmit.addActionListener(new btnSubmit());
    inputPanel.add(btnClear);
    btnClear.addActionListener(new btnClear());
    
    this.add(inputPanel);
    this.setVisible(true);

}
   
   class btnSubmit implements ActionListener{
   
       @Override
       public void actionPerformed (ActionEvent e){
       
           String first = firstText.getText();
           String last = lastText.getText();
           String middle = middleText.getText();
           String mob = mobText.getText();
           String email = emailText.getText();
           
           outputArea.append("First Name:      " + first +
                   "\n\n Last Name:      " + last + "\n\n Middle Name:   " + middle +
                   "\n\n Mobile No.:      " + mob + "\n\n Email Add.:      " + email);
           
           outputFrame.setSize(270,300);
           outputFrame.setLocation(450,270);
           outputFrame.setTitle("OUTPUT");
           outputFrame.setVisible(true);
           outputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
           outputArea.setEditable(false);
           outputArea.setBackground(Color.LIGHT_GRAY);
           outputArea.setFont(setFont);
           
           
           outputFrame.add(outputPanel);
           
           outputPanel.add(outputArea);
           outputPanel.add(outputFirst);
           outputPanel.add(outputLast);
           outputPanel.add(outputMid);
           outputPanel.add(outputMob);
           outputPanel.add(outputEmail);
           outputPanel.add(btnOkay);
           
           btnSubmit.setEnabled(false);
           btnOkay.addActionListener(new btnOkay());
           
       }
   
   }
   
   class btnClear implements ActionListener{
    
        @Override
        public void actionPerformed(ActionEvent e){
        
            firstText.setText("");
            lastText.setText("");
            middleText.setText("");
            mobText.setText("");
            emailText.setText("");
            outputArea.setText("");
            
            btnSubmit.setEnabled(true);
            outputFrame.dispose();
            
        }
    }
   
   class btnOkay implements ActionListener{
    
        @Override
        public void actionPerformed(ActionEvent e){
        
            firstText.setText("");
            lastText.setText("");
            middleText.setText("");
            mobText.setText("");
            emailText.setText("");
            outputArea.setText("");
            
            btnSubmit.setEnabled(true);
            outputFrame.dispose();
            
        }
    
    }
   
   public static void main (String []args){
   
       EventDriven_Rentura mmm = new EventDriven_Rentura() {
           @Override
           public void actionPerformed(ActionEvent e) {
               throw new UnsupportedOperationException("Not supported yet."); 
       };
   };
    
}
}
