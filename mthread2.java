// by implementing runnable interface

class myRunnable implements Runnable
{

public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("child thread is running");
}
}
}

class test 
{
 public static void main(String[]args)
 {
 myRunnable y = new myRunnable();
 
 Thread t1 = new Thread(y);                                                
 Thread t2 = new Thread(y);      
                                          
 t1.start();
 t2.start();
 }
 }
 