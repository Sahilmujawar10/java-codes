import java.util.*;
import javax.swing.*;
class test 
{
public static void main(String[]args)

{

String size = JOptionPane.showInputDialog("Enter the array size");
int s = Integer.parseInt(size);
int a[]= new int[s];
for(int i=0;i<s;i++)
{
String ele = JOptionPane.showInputDialog("Enter the elements of array");
int e = Integer.parseInt(ele);

System.out.println(ele);
Arrays.sort(a);

}
}
}