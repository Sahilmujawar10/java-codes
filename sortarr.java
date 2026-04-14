import java.util.*;
import javax.swing.*;
class test 
{
	
	public static void assending(int arr[])
	{
		Arrays.sort(arr);
		for(int i=0;i>arr.length;i++)
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

assending(a);

}

}