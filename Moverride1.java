class rbi
{
public int roi()
{

return 0;
}
}

class icici extends rbi
{

public int roi()
{
return 11;
}
}

class sbi extends rbi
{

public int roi()
{

return 9;
}
}

class boi extends rbi
{
public int roi()
{
return 10;
}
}

class bob extends rbi
{
public int roi()
{

return 12;
}
}

class test
{
public static void main(String[]args)
{
icici i= new icici();
sbi s = new sbi();
boi b =new boi();
bob b1= new bob();

System.out.println("roi of icici is"+i.roi());
System.out.println("roi of sbi is"+s.roi());
System.out.println("roi of boi is"+b.roi());
System.out.println("roi of bob is"+b1.roi());
}
}





















