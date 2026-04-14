import javax.swing.*;
class employe
{

private String name;
private String job;
private int id;
private double wadges;
private int wdays;

public employe(String nm,String jb,int i,int wd,double wadg)
{
name = nm;
job = jb;
id = i;
wdays = wd;
wadges = wadg;

}

public void showdata()
{

System.out.println("the name is"+" "+name);
System.out.println("the job is"+" "+job);
System.out.println("the e id is"+" "+ id);
System.out.println("the wadges of employe"+" "+wadges);
System.out.println("the work days are"+" "+wdays);
}

public void payment()
{

double pay = wadges*wdays;

if(pay>50000)
{

double tax = pay*0.20;
double payt = pay-tax;

System.out.println("the tax is"+" "+tax);
System.out.println("the payment after tax is"+" "+payt);
}
else
{
System.out.println("the payment is"+" "+pay);
}
}
}

class test
{

public static void main(String[]args)
{
	

employe e;

String num = JOptionPane.showInputDialog("Enter num of object");
int n = Integer.parseInt(num);
for(int j=0;j<=n;j++)
{
String name = JOptionPane.showInputDialog("Enter the name");
String job = JOptionPane.showInputDialog("Enter the job");
String id = JOptionPane.showInputDialog("Enter the id");
int i = Integer.parseInt(id);
String wdays =JOptionPane.showInputDialog("Enter the wdays");
int wd = Integer.parseInt(wdays);
String wadges = JOptionPane.showInputDialog("Enter the wadges");
double wadg = Integer.parseInt(wadges);

e = new employe(name,job,i,wd,wadg);
e.showdata();
e.payment();
}
}
}












