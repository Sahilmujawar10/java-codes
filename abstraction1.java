import javax.swing.*;
abstract class person 
{
 public String name,city;
 public  int wadges,wdays;


public void setdata()
{
 name = JOptionPane.showInputDialog("Enter name");
 city = JOptionPane.showInputDialog("Enter city");

 String wg = JOptionPane.showInputDialog("Enter wadges");
 wadges = Integer.parseInt(wg);

 String wd = JOptionPane.showInputDialog("Enter wdays");
 wdays = Integer.parseInt(wd);
}

public void showdata()
{

System.out.println("name is"+ name);
System.out.println("city name is"+ city);
System.out.println("wadges is"+ wadges);
System.out.println("wdays are"+ wdays);

}

abstract public void payment();

}


class emp extends person
{

public void setdata()
{
super.setdata();
}

public void showdata()
{
super.showdata();
}


public void payment()
{

int sal = wadges*wdays;
System.out.println("salary is "+sal);

}
}

 class manager extends emp
{

 public void setdata()
 {
	 super.setdata();
 }
 
 public void showdata()
 {
	 
	 super.showdata();
 }
 

 public void commision()
 {
	 double sal;
	 sal = wadges * wdays;
	 double com = sal * 1.10;
	 System.out.println("the commision is "+com);
	 
 }	
}

class test
{
public static void main(String[]args)
{

emp e1 = new emp();
e1.setdata();
e1.showdata();
e1.payment();

manager m1 = new manager();

m1.setdata();
m1.showdata();
m1.commision();

}
}