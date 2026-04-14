class student
{

private String name;
private String address;
private int mobileno;
private int age;
private double percentage;

public void setdata(String nam, String add,int mn,int a,int per)
{

name = nam;
address = add;
mobile no = mn;
age = a;
percentage = per;
}

public void showdata()
{

System.out.println("MY NAME IS " + name);
System.out.println("MY ADDRESS IS " + address);
System.out.println("MY MOBILE NO IS " + mobileno);
System.out.println("MY NAME IS " + age);
System.out.println("my percentage are " + percentage);

}
}

class test
{

public static void main(String[]args)
{

person p;
  
  p = new person();
  p.setdata("sahil","kolhapur","7620227489","23","78.80");
  p.showdata();
  }
  }
  

