class employe
{

private String name,job;
private int id,wdays;
private double wadges;


public void setdata(String nm, String jb,int i, int wd,double wadg)
{
name = nm;
job = jb;
id = i;
wdays = wd;
wadges = wadg;

}

public void showdata()
{

System.out.println("length is"+" "+name);
System.out.println("the job name"+" "+job);
System.out.println("the eid is"+" "+id);
System.out.println("the work days"+" "+wdays);
System.out.println("wadges are"+" "+wadges);

}

public double payment()
{

double pay = wadges*wdays;

if(pay>40000)
{

double tax = pay * 0.20;
double fpay = pay - tax;

System.out.println("the payment after tax is"+ fpay);
return fpay;
}

else{
System.out.println("the payment is"+ pay);
return pay;
}
}
}

class volm 
{
public static void main(String[]args)
{

employe e;
e = new employe();
e.setdata("sahil","chef",10,30,10000);
e.showdata();

double p = e.payment();
System.out.println("the employe payment"+" "+p);

employe e1;
e1 = new employe();
e1.setdata("sam","sellsman",10,30,40000);
e1.showdata(); 	

double p1 = e1.payment();
System.out.println("the payment of employe1 is"+" "+p1);

double add = p + p1;
System.out.println("addtion of salary is"+" "+add);
}
}


