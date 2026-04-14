class stest extends Thread
{

public void run()
{
for(int i=0;i<5;i++)
{

if((i>2)&&((Thread.currentThread().getName()).equals("BOY")))
{
Thread.currentThread().suspend();
}
else
{
System.out.println(Thread.currentThread().getName()+"anything"+i+"times");
}
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

s1.setName("kid");
s2.setName("boy");
s3.setName("man");

s1.start();
s2.start();
s3.start();
}
}
