import javax.swing.*;

class tax
{

public static void main(String []args)
{

String name = JOptionPane.showInputDialog("Enter the name of employee");
String id = JOptionPane.showInputDialog("Enter the name of id");
String job = JOptionPane.showInputDialog("Enter the name of job");
String wadges = JOptionPane.showInputDialog("Enter the wadges");
String wdays = JOptionPane.showInputDialog("Enter work days employee");

int i =Integer.parseInt(id);
int w =Integer.parseInt(wadges);
int wd =Integer.parseInt(wdays);

int sal = w * wd;

System.out.println("the name of employee is"+name);
System.out.println("employee id is" +i);
System.out.println("job of employee"+job);
System.out.println("daily salary" + w);
System.out.println("total work days"+wd);
System.out.println("the sal is" + sal);

if(sal>50000)
{

 double fs = sal * 0.72;
 double tax =  sal * 0.28;
 
 System.out.println("salary after tax is " + fs);
 System.out.println("tax on salary is "+ tax);
 }
 
 else
{
}
}
}

