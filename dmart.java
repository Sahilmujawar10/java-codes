import javax.swing.*;

class dmart
{

public static void main(String[]args)
{

int p,q,b,tb = 0;

do{

String name = JOptionPane.showInputDialog("Enter product name");
String prize = JOptionPane.showInputDialog("Enter product prize");
String quantity = JOptionPane.showInputDialog("Enter product quantity");
 p =Integer.parseInt(prize);
 q =Integer.parseInt(quantity);

 b = p*q;
 
 tb = tb+b;
 System.out.println("the product name is"+name);
 System.out.println("the product prize is"+prize);
 System.out.println("the product quantity is"+quantity);
 System.out.println("the product bill is"+b);
}

 while(p!=0);
 {
 System.out.println("the total bill is"+tb);
 System.out.println("THANK YOU FOR VISITING DMART, VISIT AGAIN");
 
 }
 }
 }
 
