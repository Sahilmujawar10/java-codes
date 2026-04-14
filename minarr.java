class test
{

public static void minimum(int s[])
{

int min = s[0];

for(int i=1;i<s.length;i++)
{
if(min>s[i])
{
min = s[i];
}
}
System.out.println("the minimum number in arrray is"+min);
}

public static void main(String[]args)
{

int a[] = {2,5,6,7,3};
minimum(a);
}
}
