import javax.swing.*;

class table
{

public static void main(String []args)
{

String number = JOptionPane.showInputDialog("Enter a number");

int n = Integer.parseInt(number);
int i =1;

while(i<=10)
{

System.out.println(n*i);
i++;
}
}
}