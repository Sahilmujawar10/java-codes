import javax.swing.*;
class person 
{

private String name,city;

public void setdata()
{
name = JOptionPane.showInputDialog("Enter the name");
city = JOptionPane.showInputDialog("Enter the city name");

}
public void showdata()
{
System.out.println("the name is"+" "+name);
System.out.println("the city name is"+" "+city);
}
}

class student extends person
{

private String product;
private int prize,quantity;

public void setdata()
{

super.setdata();

product = JOptionPane.showInputDialog("Enter product name");
String p = JOptionPane.showInputDialog("Enter the prize of product");
prize = Integer.parseInt(p);
String q = JOptionPane.showInputDialog("Enter the quantity of products");
quantity = Integer.parseInt(q);
}

public void showdata()
{

super.showdata();
System.out.println("the product is"+" "+product);
System.out.println("the prize of product is"+" "+prize);
System.out.println("the quantity of product is"+" "+quantity);
}

public void bill()
{
	int b = prize*quantity;
	System.out.println("the bill is"+b);
}

public static void main(String[]args)
{

student s1;

s1 = new student();
s1.setdata();
s1.showdata();
s1.bill();
}
}























