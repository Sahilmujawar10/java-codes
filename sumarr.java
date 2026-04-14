import javax.swing.*;
class test 
{
public static void main(String[]args)

{
int sumeven = 0;
int sumodd = 0;
String size = JOptionPane.showInputDialog("Enter the array size");
int s = Integer.parseInt(size);
int a[]= new int[s];

for(int i=0;i<s;i++)
{
String ele = JOptionPane.showInputDialog("Enter the elements of array");
int e = Integer.parseInt(ele);
System.out.println(ele);
if(e%2==0)
{	
sumeven = sumeven +e;
}
else
{
sumodd = sumodd+e;
}
}

System.out.println(sumeven);
System.out.println(sumodd);
}
}
