class student
{

private String name,city;
private int rollno;
private double percentage;

public student(String nm, String c,int rn,double per)
{

name = nm;
city = c;
rollno = rn;
percentage = per;

}

public void showdata()
{
System.out.println("the name is"+" "+name);
System.out.println("the city is"+" "+city);
System.out.println("the rollno is"+" "+rollno);
System.out.println("the percentage are"+" "+percentage);
}
}
class test 
{
public static void main(String[]args)
{

student s;
s = new student("sahil","kolhapur",45,78.80);
s.setdata();
s.showdata();
}
}

