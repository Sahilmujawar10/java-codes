import javax.swing.*;

class loopn
{

public static void main(String[]args)
{		
String number = JOptionPane.showInputDialog("Enter a number");
String name = JOptionPane.showInputDialog("Enter a name");
int n = Integer.parseInt(number);
int i = 1;

while(i<=n)
{
System.out.println(name);
i++;
}
}
}
