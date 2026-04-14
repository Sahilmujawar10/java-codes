class test 
{

public static void count(int s[])
{

int c = 0;

for(int i=0;i<s.length;i++)
{
if(s[i]==7)
{
c++;
}
}
System.out.println(c);
}


public static void add(int d[])
{
	int v = 0;
	for(int i=0;i<d.length;i++)
	{
		if(d[i]==4)
		{
			v++;
		}
	}
	System.out.println(v);
}

public static void main(String[]args)
{

int a[] = {4,7,5,4,7,5,9,4,6,7,4};

count(a);
add(a);
}
}
