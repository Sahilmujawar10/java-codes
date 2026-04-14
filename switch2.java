import javax.swing.*;
class switch2
{

public static void main(String[]args)
{

int total = 0;
String num1 = JOptionPane.showInputDialog("Enter first number");
String num2 = JOptionPane.showInputDialog("Enter second number");

int n1 = Integer.parseInt(num1);
int n2 = Integer.parseInt(num2);

String ch = JOptionPane.showInputDialog("Enter A for Addition \n Enter S for substraction \n Enter M for multiplication \n Enter D for division");
System.out.println("First number is"+n1);
System.out.println("second number is "+n2);
switch(ch)
{

case"a":
case"A": 

int add = n1+n2;

System.out.println("the addition of 2 numbers is" + add);

break;

case"s":
case"S":

int sub = n1-n2;

System.out.println("the substraction of 2 numbers is"+sub);
break;

case"d":
case"D":

int div = n1/n2;

System.out.println("the division of 2 numbers is"+div);
break;

case"m":
case"M":

int mul = n1*n2;

System.out.println("the multiplication of 2 numbers is"+mul);
break;

default:

System.out.println("Select the valid choice");
}
}
}