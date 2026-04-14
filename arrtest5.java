import javax.swing.*;
class student
{

private String name,branch;
private int rollNo;



public student()
{

name = JOptionPane.showInputDialog("Enter name");
branch = JOptionPane.showInputDialog("Enter branch");
String Rn = JOptionPane.showInputDialog("Enter rollno");
rollNo = Integer.parseInt(Rn);

}

public void showdata()
{
System.out.println("the name of student is:"+" "+name);
System.out.println("branch of student is:"+" "+branch);
System.out.println("rollNo of student:"+" "+rollNo);

}
}

class test 
{
	
	public static void main(String[]args)
	{
		
		student s1 = new student();
		
		s1.showdata();
		
		
	}
	
}