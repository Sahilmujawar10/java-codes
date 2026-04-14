import javax.swing.*;

class largest
{

public static void main(String[]args)
{

String num1 = JOptionPane.showInputDialog("Enter 1st number");
String num2 = JOptionPane.showInputDialog("Enter 2nd number");
String num3 = JOptionPane.showInputDialog("Enter 3rd number");

int n1 = Integer.parseInt(num1);
int n2 = Integer.parseInt(num2);
int n3 = Integer.parseInt(num3);

if(n1>n2 && n1>n3)
{
System.out.print("first number is greater"+n1);
}

else if(n2>n1&&n2>n3)
{
System.out.print("the second number is largest"+n2);
}
else if(n3>n1 && n3>n2)
{
System.out.println("the third number is largest"+n3);
}
else if(n1==n2)
{
	System.out.println("the n1 and n2 both are largest");
}
else if(n1==n3)
{
	System.out.println("the n1 and n3 both same and are largest");
}
else if(n2==n3)
{
	System.out.println("the n2 and n3 both same and are largest");
}

else{

System.out.print("all numbers are same");
}
}
}
