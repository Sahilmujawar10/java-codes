class addition
{
public void sum(int a,String nm)
{

System.out.println(" a is"+" "+a);
System.out.println("the name is"+" "+nm);
}

public void sum(int a,int b,String nm,int c)
{

int s = a+b+c;
System.out.println("the addtion of a+b+c is"+" "+s);
}
}

class test
{
public static void main(String[]args)
{
addition a;

a =new addition();
a.sum(10,"sahil");
a.sum(10,20,"raj",30);
}
}
