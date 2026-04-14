import javax.swing.*;

class payment

{

private String name;
private int empid;
private String job;
private double w;
private int wd;



public void setdata()
{

name = JOptionPane.showInputDialog("Enter the name");
job  = JOptionPane.showInputDialog("Enter the job");
String wadges = JOptionPane.showInputDialog("Enter the wadges");
String id  = JOptionPane.showInputDialog("Enter the em id");
String wd = JOptionPane.showInputDialog("Enter work days");
wadg = Double.parseDouble(wadges);
i = Integer.parseInt(empid);
w = Integer.parseInt(wd);

}

public void showdata()
{

System.out.println("name of employe" + " "+ name);
System.out.println("name of job" + " "+ job);
System.out.println("id of employe" + " "+ i);
System.out.println("wadges of employe" + " "+ wadg);
System.out.println("work days of employe" + " "+ w);
}

public void payment()
{
	double pay = wadg*w;

if(pay>25000)
{
	double tax = pay*0.18;
	double fs = pay-tax;
	
	System.out.println("payment is" + pay);
	System.out.println("payment after tax" + tax);
	System.out.println("payment is" + fs);
	
}
else{
	
	System.out.println("payment is" + pay);
}
}
}
class tax
{
public static void main(String[]args)
{
 payment p;
 
 p = new payment();
 p.setdata();
 p.showdata();
 p.payment();
 
 }
 }
 



