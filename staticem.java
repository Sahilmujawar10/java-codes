class employe 
{

private String ename;
private int e_id;
private int age;
static String CompanyName = "google";

static void change()
{
	CompanyName = "tesla";
}
public employe(String nm,int id,int a)
{

ename =nm;
e_id = id;
age = a;
}

public void showdata()
{

System.out.println("the name is"+" "+ ename);
System.out.println("the id is"+" "+ e_id);
System.out.println("the age is"+" "+ age);
System.out.println("the age is"+" "+ CompanyName);

}
}

class test
{

public static void main(String[] args)
{

//employe.change();
employe e1;

e1 = new employe("sahil",44,23);
e1.showdata();
}
}
