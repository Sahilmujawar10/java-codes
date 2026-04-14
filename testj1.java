import javax.swing.*;
class student

{
private String name,city;
private int rollno;
private double percentage;

public student (String nm,String c, int rn,double per)
{

name =nm;
city =c;
rollno =rn;
percentage = per;


}

public void showdata()
{

System.out.println("the name is" + " "+ name);
System.out.println("the city is" + " "+city);
System.out.println("the rollno is" +" "+ rollno);
System.out.println("the percentage are" + " "+percentage);

}
}

class test
{
 public static void main(String[]args)
 {
 
 student s;
 
 String name = JOptionPane.showInputDialog("Enter the name");
 String city = JOptionPane.showInputDialog("Enter the city");
 String rollno = JOptionPane.showInputDialog("Enter rollno");
 String percentage = JOptionPane.showInputDialog("Enter percentage");
 int r = Integer.parseInt(rollno);
 double per = Double.parseDouble(percentage);
 
 s = new student(name,city,r,per);
 s.showdata();
 
 
 }
 }

