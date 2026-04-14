import javax.swing.*;

class testsw
{

public static void main(String[]args)
{

int balance = 10000;

String ch = JOptionPane.showInputDialog("prees D for deposite \n prees W for widraw \n prees BE for balance enqiry \n press E for exit");

switch(ch)
{
case"d":
case"D": String damnt = JOptionPane.showInputDialog("enter the amount u want to deposite");
int d = Integer.parseInt(damnt);
balance = balance + d;
System.out.println("Amount default succsessfully");
System.out.println("the total balance after deposite is " + balance);
break;

case"w":
case"W": String widraw = JOptionPane.showInputDialog("enter amount for widraw");
int w =Integer.parseInt(widraw);

if(w>balance)
{
System.out.println("insufficient funds");
}
else{

balance = balance-w;
System.out.println("funds widraw succsessfully");
System.out.println("after widraw balance is " + balance);
}
break;

case"be":
case"BE": 
System.out.println("your balance is" + balance);
break;

case"e":
case"E": 
         System.out.println("thank you visit again");
		 break;

default:	
        System.out.println("Enter the valid information");
}
}
}
		


