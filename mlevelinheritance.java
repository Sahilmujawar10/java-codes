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

class employe extends person
{

private String job;
private int id,sal;

public void setdata()
{

super.setdata();

job = JOptionPane.showInputDialog("Enter job name");
String i = JOptionPane.showInputDialog("Enter id");
id = Integer.parseInt(i);
String s = JOptionPane.showInputDialog("Enter salary");
sal = Integer.parseInt(s);
}

public void showdata()
{

super.showdata();
System.out.println("the job name is"+" "+job);
System.out.println("the id is"+" "+" "+id);
System.out.println("the salary is"+" "+sal);
}
}

class manager extends employe
{

private String dname;
private int dno;

public void setdata()
{

super.setdata();

dname = JOptionPane.showInputDialog("Enter department name");
String dn = JOptionPane.showInputDialog("Enter department no");
dno = Integer.parseInt(dn);
}

public void showdata()
{

super.showdata();

System.out.println("the department name is"+" "+dname);
System.out.prinln ("the department no is"+" "+dno);

}
}

class test
{
public static void main(String[]args)
{

manager m;

m = new manager();
m.setdata();
m.showdata();
}
}










































