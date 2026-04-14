// currentThread name method 
class stest extends Thread
{

public void run()
{
for(int i=0;i<5;i++)
{
try{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(Thread.currentThread().getName()+"apla chiken cha"+i+"+peice khat aahe");
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

s1.setName("basya");
s2.setName("lakshya");
s3.setName("akshay");

s1.start();
s2.start();
s3.start();
}
}
