import javax.swing.*;

class test 
{

public static void main(String[]args)
{

String name = JOptionPane.showInputDialog("how many name of friends u want to enter");
int n =Integer.parseInt(name);
for(int i=0;i<n;i++)
{
String names = JOptionPane.showInputDialog("enter the name of friends");
System.out.println(names);
}

}
}