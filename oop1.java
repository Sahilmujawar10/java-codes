import javax.swing.*;
class student
{

private String name, cityname;

public void setdata()
{
name = JOptionPane.showInputDialog("ENTER THE NAME");
cityname = JOptionPane.showInputDialog("ENTER THE CITYNAME");
}

public void showdata()
{
System.out.println("name is"+" "+ name);
System.out.println("city name"+" "+cityname);
}
}

class test
{

public static void main(String[]args)
{

student s;

s = new student();
s.setdata();
s.showdata();
}
}



