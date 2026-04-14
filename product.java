import javax.swing.*;
class product
{

public static void main(String [] args)
{

String name = JOptionPane.showInputDialog("Enter product name");
String prize = JOptionPane.showInputDialog("Enter prize");
String quantity = JOptionPane.showInputDialog("Enter quantity");

int a = Integer.parseInt(prize);
int b = Integer.parseInt(quantity);
int c = a*b;

System.out.println("Product name is" + name);
System.out.println("product prize is" + a);
System.out.println("quantity is " + b);
System.out.println("bil amount is" + c);

if(c>10000){
	
	double d = c*0.8;
	double f = c*0.2;
	
	System.out.println("the discount amount is" + d);
	System.out.println("the bill amount after discount is " + f);
}
	
	else{
		
	}	
}
}