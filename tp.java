//design a class emp containing data member emp id ename job and companyname make companyname as static 

class company
{
static{
	System.out.println("ill run before main method");
}

private String name;
private String job;
private int id;
static String companyname = "INFOSYS";
static void change()
{
companyname = "GOOGLE";
}
public company(String nm,String jb,int i)
{
name = nm;
job = jb;
id = i;
}

public void showdata()
{
System.out.println("the e name is"+" "+name);
System.out.println("the e job name is"+" "+job);
System.out.println("the e id is"+" "+id);
System.out.println("the e companyname is"+" "+companyname);
}
}
class test 
{
public static void main(String[]args)
{

company c1;
//company.change();
c1 = new company("sahil","developer",10);
c1.showdata();
}
}
