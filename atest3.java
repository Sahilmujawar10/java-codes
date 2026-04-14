class test
{
public static void main(String[]args)
{
int sum = 0;
int a[] = {10,11,24,51,3,1};

for(int i=0;i<a.length;i++)
{
if(a[i]%2!=0)
{
sum = sum+a[i];
}
}
System.out.println(sum);
}
}

