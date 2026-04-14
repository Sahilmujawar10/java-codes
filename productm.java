import javax.swing.*;
class productm //main
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

if(c>40000)
{
	double d = c*0.70;
	double f = c*0.30;
	
	System.out.println("the discount amount is" + d);
	System.out.println("the bill amount after discount is " + f);
}

else if(c>30000)
{
  double d = c*0.80;
  double f = c*0.20;
  
  System.out.println("the discount amount is" + d);
  System.out.println("the bill amount after discount is " + f);
	}
	
	
	else if(c>20000)
{

  double d = c*0.75;
  double f = c*0.15;
  
  System.out.println("the discount amount is" + d);
	System.out.println("the bill amount after discount is " + f);
	}
	
	
	else if(c>10000)
{

  double d = c*0.90;
  double f = c*0.10;
  
  System.out.println("the discount amount is" +f);
	System.out.println("the bill amount after discount is "+d);
	}
	
	
	
	
	else if(c>5000)
{

  double d = c*0.95;
  double f = c*0.5;
  
  System.out.println("the discount amount is" + d);
	System.out.println("the bill amount after discount is " + f);
	}
	
	else{
		
	}	
}
}