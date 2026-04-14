//sleep and join method
class stest extends Thread
{

public void run()
{
for(int i=1;i<=10;i++)
{

try{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(i);
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


s2.start();

try{

   s2.join(5000);
}
catch(Exception e)
{
System.out.println(e);
}

s1.start();
s3.start();
s4.start();

}
}               

