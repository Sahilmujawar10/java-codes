import javax.swing.*;
class palindrom
{

public static void main(String args[])
{

String num = JOptionPane.showInputDialog("Enter the number");
int n = Integer.parseInt(num);
System.out.println("the number is"+" "+n);

int a = n%10;
int b = n/10;
int c = b%10;
int d = n/10;
int h = n/10;
int g = h/10;


if(g==a)
{
System.out.println("the number is palindrom");
}

else{
System.out.println("the number is not palindrom");
}
} 
}