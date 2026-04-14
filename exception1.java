class test 
{

public static void main(String[]args)
{

try
{
int n = 70/0;
}

catch(ArithmeticException e1)
{
System.out.println(e1);
System.out.println("rest of the code executed");
}
}
}

