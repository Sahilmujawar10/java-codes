class student
{

private String name;
private int rollno;
static String collagename = "D Y Patil";

static void change()
{
	collagename = "MIT";
}


public student(String nm,int rn)
{

name = nm;
rollno =rn;
}

public void showdata()
{

System.out.println("the name is"+" "+ name);
System.out.println("the roll no is"+" "+ rollno);
System.out.println("collagename is"+" "+ collagename);
}
}

class test 
{

public static void main(String []args)
{

student.change();
student s1;

s1 = new student("sahil",44);

s1.showdata();
}
}
