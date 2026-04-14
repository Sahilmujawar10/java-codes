import javax.swing.*;

class test 
{


public static void index(int arr[])
{
int indx = 0;

for(int i=arr.length-1;i>=0;i--)
{
System.out.println(indx);
System.out.println(arr[i]);
indx++;

}
}

public static void main(String[]args)
{
String size = JOptionPane.showInputDialog("Enter the size of array");
int s =Integer.parseInt(size);
int a[] = new int[s];
for(int i=0;i<s;i++)
{
String ele = JOptionPane.showInputDialog("Enter elements of array");
a[i] = Integer.parseInt(ele);
}
index(a);
}
}
	

