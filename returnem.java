class employe
{

private String name,job;
private int id,wdays;
private double wadges;


public void setdata(String nm,String jb, int i, int wd , int wadg)
{

name = nm;
job = jb;
id = i;
wdays =wd;
wadges = wadg;
}

public void showdata()
{
System.out.println("the name is"+" "+name);
System.out.println("the job is"+" "+job);
System.out.println("the e id is"+" "+ id);
System.out.println("the wadges of employe"+" "+wdays);
System.out.println("the work days are"+" "+wadges);
}

public double payment()
{
double pay = wdays*wadges;
return pay;

if(pay>40000)
{
double tax = pay*0.20;
double payt = pay -tax;

System.out.println("the payment of employe is"+" "+payt);
}
else{

System.out.println("the payment of employe is"+" "+pay);
}
}
}

class test
{
public static void main(String[]args)
{

employe e;
String name = JOptionPane.showInputDialog("Enter the name");
String job = JOptionPane.showInputDialog("Enter the job");
String id = JOptionPane.showInputDialog("Enter the id");
int i = Integer.parseInt(id);
String wdays =JOptionPane.showInputDialog("Enter the wdays");
int wd = Integer.parseInt(wdays);
String wadges = JOptionPane.showInputDialog("Enter the wadges");
double wadg = Integer.parseInt(wadges);
e = new employe(name,job,i,wd,wadg);
e.setdata();
e.showdata();
double p = e.payment();

employe e1;
String name = JOptionPane.showInputDialog("Enter the name");
String job = JOptionPane.showInputDialog("Enter the job");
String id = JOptionPane.showInputDialog("Enter the id");
int i = Integer.parseInt(id);
String wdays =JOptionPane.showInputDialog("Enter the wdays");
int wd = Integer.parseInt(wdays);
String wadges = JOptionPane.showInputDialog("Enter the wadges");
double wadg = Integer.parseInt(wadges);
e1 = new employe(name,job,i,wd,wadg);
e1.setdata();
e1.showdata();
double p1 = e1.payment();

double add = p+p1;

System.out.println("the addition of payment of two employe's"+" "+add);
}
}









