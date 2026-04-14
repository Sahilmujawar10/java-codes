import javax.swing.*;

class inputloop
{

public static void main(String []args)
{

String num = JOptionPane.showInputDialog("Enter the positive number");

int n = Integer.parseInt(num);
int i = 1;

while(i<=n)
{

System.out.println(i);
i++;
}
}
}
