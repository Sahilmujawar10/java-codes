class employe
{

private String name,job;
private int id;
private double salary;


public void setdata(String nm, String jb,int i,double sl)
{
name = nm;
job = jb;
id = i;
salary = sl;

}

public void showdata()
{

System.out.println("name is"+" "+name);
System.out.println("the job name"+" "+job);
System.out.println("the eid is"+" "+id);
System.out.println("the salary"+" "+salary);
}
}

class test 
{
public static void main(String[]args)
{

employe e;
e = new employe();
e.setdata("sahil","chef",10,10000);
e.showdata();

System.out.println(" ");

employe e1;
e1 = new employe();
e1.setdata("sam","sellsman",11,40000);
e1.showdata(); 	

System.out.println(" ");

employe e2;
e2 = new employe();
e2.setdata("raj","CA",12,50000);
e2.showdata();
}
}


