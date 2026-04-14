class stest extends Thread
{

public void run()
{
System.out.println(Thread.currentThread().getName()+" "+"priority is"+" "+ Thread.currentThread().getPriority());
}
}

class test 
{
public static void main(String[]args)
{

stest s1 = new stest();
stest s2 = new stest();
stest s3 = new stest();

s1.setPriority(Thread.MIN_PRIORITY);
s2.setPriority(Thread.MAX_PRIORITY);
s3.setPriority(Thread.NORM_PRIORITY);

s1.setName("zoya");
s2.setName("suhana");
s3.setName("alfiya");

s1.start();
s2.start();
s3.start();

}
}

