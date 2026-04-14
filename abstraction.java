abstract class circle
{
int r;

public void setRadius(int x)
{

r = x;

}

abstract public void area();
}

class Ncircle extends circle
{
public void circum()
{

double cir = 2 * 3.14*r;
System.out.println("circumference of circle:" + cir);

}

public void area()
{

double A = 3.14 * r*r;
System.out.println("area of circle:" + A);

}
}

class test
{

public static void main(String []args)
{

Ncircle c1  = new Ncircle();
c1.setRadius(5);
c1.circum();
c1.area();
}
}
