//sleep method
class stest extends Thread
{

public void run()
{
for(int i=1;i<=10;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("chiken 65 cha peice no"+" "+i+" "+"khat ahe");
}
}
}

class test
{
public static void main(String[]args)
{
stest t1 = new stest();
stest t2 = new stest();
stest t3 = new stest();
stest t4 = new stest();
  
         t1.start();
         t2.start();
         t3.start();
         t4.start();
}
}

