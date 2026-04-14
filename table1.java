import javax.swing.*;

class table1
{

public static void main(String[]args)
{

String num = JOptionPane.showInputDialog("Enter a number");
int n = Integer.parseInt(num);

for(int j =1; j<=3;j++)
{
for(int i=1;i<=j;i++)
{
System.out.print(n);
n = n*2;
}
}
}
}

//int num = 2;
//for(int j =1; j<=5;j++)
//{
//for(int i=1;i<=j;i++)
//{
//System.out.print(num);
//num=num+2;

//}
//System.out.println();