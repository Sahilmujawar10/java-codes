class test
{
public static void main(String[]args)
{

try
{
int a[] = {7,4,3,9,6};
System.out.println(a[7]);
}

catch(ArithmeticException e1)
{
System.out.println("cannot divided by 0");
}
catch(NullPointerException e2)
{
System.out.println("please pass the value");
}
catch(ArrayIndexOutOfBoundsException e3)
{
System.out.println("evde Index aplya array madhe nahit");
}
finally
{
System.out.println("remaining code executed");
}
}
}
