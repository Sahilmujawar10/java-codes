class box 
{

private int l,b,h;

public void setdata(int len, int bre, int hei)
{
l = len;
b = bre;
h = hei;
}

public void showdata()
{

System.out.println("length is"+" "+l);
System.out.println("breadth is"+" "+b);
System.out.println("height is"+" "+h);
}

public int volume()
{

int vol = l*b*h;
return vol;
}
}

class volm 
{
public static void main(String[]args)
{

box b;
b = new box();
b.setdata(10,20,30);
b.showdata();

int vb = b.volume();
System.out.println("the volume of box is"+" "+vb);

box b1;
b1 = new box();
b1.setdata(5,10,15);
b1.showdata();

int vb1 = b1.volume();
System.out.println("the volume of box1 is"+" "+vb1);

int add = vb + vb1;
System.out.println("addtion of volume of boxes is"+" "+add);
}
}


