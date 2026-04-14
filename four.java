class four
{

public static void main(String [] args)
{

int n = 1234;
int a = n%10;
int b = n/10;
int c = b%10;
int d = n/10;
int h = n/10;
int g = h/10;
int m = g/10;
int l = g%10;

int add = m+l+c+a;

System.out.println("first number is" + m);
System.out.println("second number is" + l);
System.out.println("second number is" + c);
System.out.println("third number is" + a);

System.out.println("the addition of four digits is " + add);

}
}