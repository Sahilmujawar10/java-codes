class test
{

public static void minimum(int s[])
{

int larg = s[0];

for(int i=1;i<s.length;i++)
{
if(larg<s[i])
{
larg = s[i];
}
}
System.out.println("the maximum number in arrray is"+larg);
}

public static void main(String[]args)
{

int a[] = {2,5,6,7,3};
minimum(a);
}
}
