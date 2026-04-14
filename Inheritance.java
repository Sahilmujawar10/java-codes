class person
{

private String name,city;

public void setdata(String nm,String c)
{

name = nm;
city = c;
}

public void showdata()
{
System.out.println("name is"+ name);
System.out.println("city is"+ city);
}
}

class student extends person
{

private int rollno,marks;
private String collagename;

public void setdata(String nm,String c,int rn,int mr,String cl)
{
super.setdata(nm,c);

rollno = rn;
marks = mr;
collagename = cl;
}

public void showdata()
{
	super.showdata();
	System.out.println("roll no is"+ rollno);
    System.out.println("marks is"+ marks);
	System.out.println("clg name is"+ collagename);
}
public static void main(String[]args)
{

student s1;

s1 = new student();
s1.setdata("sahil","kolhapur",10,80,"DYP");
s1.showdata();
}
}













