import javax.swing.*;
class person

{
private int age;
private String name,city;

public person(String nm,String c, int a)
{

name =nm;
city =c;
age = a;

}

public void showdata()
{

System.out.println("the name is" + " "+ name);
System.out.println("the city is" + " "+city);
System.out.println("the age is" +" "+ age);
}
}

class test
{
 public static void main(String[]args)
 {
 
 person p;
 
 String name = JOptionPane.showInputDialog("Enter the name");
 String city = JOptionPane.showInputDialog("Enter the city");
 String age = JOptionPane.showInputDialog("Enter age");
 int a = Integer.parseInt(age);
 
 p = new person(name,city,a);
 p.showdata();
 
 
 }
 }

