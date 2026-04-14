class test
{

public static void count(int s[])
{
int c = 0; 
for(int i=0;i<s.length;i++)
{
if(s[i]==4)
{
c++;
}
}
System.out.print(c);
}

public static void main(String[]args)
{

int a[] = {4,7,5,4,7,5,9,4,6,7,4,4};

count(a);
}
}
	