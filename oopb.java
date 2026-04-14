class student
{

private String name;
private String address;


public void setdata(String nam, String add)
{

name = nam;
address = add;

}

public void showdata()
{

System.out.println("MY NAME IS " + name);
System.out.println("MY ADDRESS IS " + address);

}
}

class test
{

public static void main(String[]args)
{

student s;
  
  s = new student();
  s.setdata("sahil","kolhapur");
  s.showdata();
  }
  }
  

