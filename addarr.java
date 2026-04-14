class test
{

public static void add(int s[])
{
int addition = s[0];

for(int j=1;j<s.length;j++)
{
addition = addition+s[j];
}
System.out.println(addition);
}
public static void main(String[]args)
{
int a[] = {9,7,6,11,12,7,6,2};

add(a);
}
}
