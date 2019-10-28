//IMPORTING THE MODULES
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class customerEntry
{
    customerEntry()
    {
        JFrame cusFram = new JFrame("CUSTOMER ENTRY");
        JLabel cusName,cusPhnNo,cusPass,cusReg;

        //DECLARING THE LABELS
        cusReg=new JLabel("CUSTOMER REGISTRATION");
        cusName = new JLabel("CUSTOMER NAME");
        cusPhnNo = new JLabel("CUSTOMER ID");
        cusPass = new JLabel("CUSTOMER PASSWORD");

        //SETTING BOUNDS FOR LABELS
        cusFram.setSize(1050,1000);
        cusReg.setBounds(150,20,200,200);
        cusName.setBounds(50,150,200,50);
        cusPhnNo.setBounds(50,250,200,50);
        cusPass.setBounds(50,350,200,50);

        //ADDING THE LABELS TO THE FIELD
        cusFram.add(cusReg);
        cusFram.add(cusName);
        cusFram.add(cusPhnNo);
        cusFram.add(cusPass);

        //DECLARING TEXT FIELDS
        JTextField txtcusName,numcusPhnNo,numcusID;
        txtcusName = new JTextField();
        numcusPhnNo = new JTextField();
        numcusID = new JTextField();

        //SETTING BOUNDS FOR TEXT FIELDS
        txtcusName.setBounds(200,150,200,50);
        numcusPhnNo.setBounds(200,250,200,50);
        numcusID.setBounds(200,350,200,50);

        //ADDING TEXTFIELDS TO THE FRAME
        cusFram.add(txtcusName);
        cusFram.add(numcusPhnNo);
        cusFram.add(numcusID);
        //ADDING A BUTTON
        JButton btnConfirm= new JButton("CONFIRM DETAILS");
        btnConfirm.setBounds(250,450,200,50);
        //btnConfirm.addActionListener(this);
        cusFram.add(btnConfirm);


        //SETTING UP THE ACTION
        

        //TURNING ON THE CODE
        cusFram.setLayout(null);
        cusFram.setVisible(true);
    }
    // public void actionPerformed(ActionEvent e)
    // {
    //     String stcusName=txtcusName.getText();
    //     String stnumcusPhnNo=numcusPhnNo.getText();
    //     String stnumcusID=numcusID.getText();
    //     int numPhnNo = Integer.parseInt(stnumcusPhnNo);
    //     int numID = Integer.parseInt(stnumcusID);
    //     System.out.println(stcusName);
    //     int a = numPhnNo + numID;
    //     System.out.println(a);       
    // }
public static void main(String[] args)
{
    new customerEntry();
}

}