import javax.swing.*;

class fclass
{

public static void main(String [] args )
{

String name = JOptionPane.showInputDialog("Enter name"); 
String roll = JOptionPane.showInputDialog("Enter roll no");
String sub1 = JOptionPane.showInputDialog("Enter marks of sub1");
String sub2 = JOptionPane.showInputDialog("Enter marks of sub2");
String sub3 = JOptionPane.showInputDialog("Enter marks of sub3");
String sub4 = JOptionPane.showInputDialog("Enter marks of sub4");
String sub5 = JOptionPane.showInputDialog("Enter marks of sub5");

int a = Integer.parseInt(roll);
int b = Integer.parseInt(sub1);
int c = Integer.parseInt(sub2);
int d = Integer.parseInt(sub3);
int e = Integer.parseInt(sub4);
int f = Integer.parseInt(sub5);

int cal = b+c+d+e+f;
int per = cal/5;

System.out.println("name is"+ name);
System.out.println("roll no is" + a);
System.out.println("sub1 marks are" + b);
System.out.println("sub2 marks are" + c);
System.out.println("sub3 marks are" + d);
System.out.println("sub4 marks are" + e);
System.out.println("sub5 marks are" + f);
System.out.println("total marks are" +cal);
System.out.println("percentage is" +per);

if(per>60)
{

System.out.println(name+ " "+"pass with first class");
}

else{
}

}
}


