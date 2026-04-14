import javax.swing.*;

class test 
{


public static void sort(int arr[])
{
int temp;
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
}

for(int i =0; i<arr.length;i++)
{
System.out.println(arr[i]);
}
}

public static void main(String[]args)
{

String size = JOptionPane.showInputDialog("Enter the array size");
int s = Integer.parseInt(size);
int a[]= new int[s];
for(int i=0;i<s;i++)
{
String ele = JOptionPane.showInputDialog("Enter the elements of array");
a[i] = Integer.parseInt(ele);
}

sort(a);

}

}