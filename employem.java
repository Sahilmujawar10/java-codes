import javax.swing.*;

class employem //main
{

public static void main(String [] args)
{

String name = JOptionPane.showInputDialog("Enter the name of employe");
String id = JOptionPane.showInputDialog("Enter the id of employe");
String wadges = JOptionPane.showInputDialog("Enter the wadges");
String wdays = JOptionPane.showInputDialog("Enter days filled of an employe");

int i = Integer.parseInt(id);
int w = Integer.parseInt(wadges);
int wd = Integer.parseInt(wdays);

int sal = w*wd;

System.out.println("the salary is " + sal);


if(sal>100000)
{
double s = sal*0.70;
double tax = sal*0.30;

System.out.println("salary after tax is"+ s);
System.out.println("the tax amount is" + tax);
}

else if(sal>75000)
{

double s = sal*0.80;
double tax = sal*0.20;

System.out.println("salary after tax is"+ s);
System.out.println("the tax amount is" + tax);
	
}

else if(sal>50000)
{
	double s = sal*0.88;
double tax = sal*0.12;

System.out.println("salary after tax is"+ s);
System.out.println("the tax amount is" + tax);
}

else if(sal>30000)
{
double s= sal*0.95;
 double tax = sal*0.5;

System.out.println("salary after tax is"+ s);
System.out.println("the tax amount is" + tax);
}


else{
}








}
}

