//getName setName methods
class stest extends Thread
{

public void run()
{
System.out.println("thread is runnig");
}
}
class test 
{
public static void main(String[]args)
{

stest s1 = new stest();
stest s2 = new stest();
stest s3 = new stest();

System.out.println("before barsa of s1"+s1.getName());
System.out.println("before barsa of s2"+s2.getName());
System.out.println("before barsa of s3"+s3.getName());

s1.setName("lakshya");
s2.setName("akshay");
s3.setName("basva");

System.out.println("after barsa of s1"+" "+s1.getName());
System.out.println("after barsa of s2"+" "+s2.getName());
System.out.println("after barsa of s3"+" "+s3.getName());
}
}
