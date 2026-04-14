class stest extends Thread
{

public void run()
{

if(Thread.currentThread().isDaemon())
{
System.out.println(Thread.currentThread().getName()+"is service provider thread");
}
else{
System.out.println(Thread.currentThread().getName()+"is khadudi thread");
}
}
}
class test 
{
public static void main(String[]args)
{
stest s1 = new stest();
stest s2 = new stest();
stest s3 = new stest();
stest s4 = new stest();

s1.setName("akshay");
s2.setName("basva");
s3.setName("lakshya");
s4.setName("sarang");

s4.setDaemon(true);

s1.start();
s2.start();
s3.start();
s4.start();
}
}



