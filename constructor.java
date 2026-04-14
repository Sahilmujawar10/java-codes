import javax.swing.*;
class person

{
private int age;
private String name,city;

public person()
{
	
	
name= JOptionPane.showInputDialog("Enter name");
city= JOptionPane.showInputDialog("Enter city");
String a= JOptionPane.showInputDialog("Enter age");

age = Integer.parseInt(a);

}

public void showdata()
{

System.out.println("the name is" + " "+ name);
System.out.println("the age is" +" "+ age);
System.out.println("the city is" + " "+city);
}
}

class test
{
 public static void main(String[]args)
 {
 
 person p;
 
 p = new person();
 p.showdata();
 
 person p1;
 
 p1 = new person();
 p1.showdata();
 }
 }

