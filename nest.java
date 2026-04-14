import javax.swing.*;

class nest
{

public static void main(String []args)
{

String roll = JOptionPane.showInputDialog("Enter the id of student");
String sub1 = JOptionPane.showInputDialog("Enter the marks of sub1");
String sub2 = JOptionPane.showInputDialog("Enter the marks of sub2");
String sub3 = JOptionPane.showInputDialog("Enter the marks of sub3");
String sub4 = JOptionPane.showInputDialog("Enter the marks of sub4");
String sub5 = JOptionPane.showInputDialog("Enter the marks of sub5");

int r= Integer.parseInt(roll);
int s1= Integer.parseInt(sub1);
int s2= Integer.parseInt(sub2);
int s3= Integer.parseInt(sub3);
int s4= Integer.parseInt(sub4);
int s5= Integer.parseInt(sub5);

System.out.println("marks of sub1 are" + s1);
System.out.println("marks of sub2 are" + s2);
System.out.println("marks of sub3 are" + s3);
System.out.println("marks of sub4 are" + s4);
System.out.println("marks of sub5 are" + s5);

int t = s1+s2+s3+s4+s5;
double per = t/5;

System.out.println("total marks are" + t);
System.out.println("percentage is" + per);

if(s1>=40&&s2>=40&&s3>=40&&s4>=40&&s5>=40)
{

System.out.println("pass");

if(per>60)
{

System.out.println("pass with first class");
}
}

else {

System.out.println("fail");
}
}
}


