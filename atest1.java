import javax.swing.*;
class test 
{

public static void reverse(int arr[])
{

for(int i=arr.length-1;i>0;i--)
{
System.out.println(arr[i]);
}
}

public static void main(String[]args)
{

String size = JOptionPane.showInputDialog("Enter size of array");
int s = Integer.parseInt(size);
int a[] = new int[s];

for(int i=0;i<s;i++)
{
String ele = JOptionPane.showInputDialog("Enter the elements in array");
a[i] = Integer.parseInt(ele);
}
a(reverse);
}
}


