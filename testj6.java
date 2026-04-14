class employe
{

private String name;
private String phonno;
private int wdays;
private double wadges;


public void setdata(String nm, long ph, int wd,double wadg)
{
name = nm;
phonno = ph;
wdays = wd;
wadges = wadg;

}

public void showdata()
{

System.out.println("eName is"+" "+name);
System.out.println("the phone no is "+" "+phonno);
System.out.println("the work days"+" "+wdays);
System.out.println("wadges are"+" "+wadges);

}
}

class test
{
public static void main(String[]args)
{

employe e;
e = new employe();
e.setdata("sahil","7620227489",30,10000);
e.showdata();

System.out.println(" ");

employe e1;
e1 = new employe();
e1.setdata("sam","8484888290",30,40000);
e1.showdata(); 	

}
}


