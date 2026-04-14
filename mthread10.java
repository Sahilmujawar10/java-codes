class table 
{
synchronized void printTable(int n)
{

for(int i = 1;i<=10;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(n*i);
}
}
}

class myThreads1 extends Thread
{
table t;

public myThreads1(table t)
{
this.t = t;
}
public void run()
{
t.printTable(5);
}
}

class Mythreadz extends Thread
{
table t;
public Mythreadz(table t)
{
this.t = t;
}
public void run()
{
t.printTable(7);
}
}

class test
{
public static void main(String[]args)
{

table t = new table();

myThreads1 t1 = new myThreads1(t);
Mythreadz t2 = new Mythreadz(t);

t1.start();
t2.start();
}
}
