class test 
{

public static void min(int r[])
{

int min = r[0];

for(int i=1;i<r.length;i++)
{
if(min>r[i])
{
min = r[i];
}
}
System.out.println("the minimum number in arrray is"+min);
}
public static void max(int s[])
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
public static void add(int n[])
{
int addition = n[0];

for(int j=1;j<n.length;j++)
{
addition = addition+n[j];
}
System.out.println("the addition of array elements are"+" "+addition);
}
public static void average(int q[])
{
int add = q[0];
int c =0;
float avg = 0;
for(int l=1;l<q.length;l++)
{
add = add+q[l];
}
for(int x=0;x<q.length;x++)
{
	c++;
}
avg = add/c;

System.out.println("the average of addition is"+" "+avg);
}
public static void main(String[]args)
{

int a[] ={9,7,6,11,12,7,6,2};

add(a);
average(a);
min(a);
max(a);
}
}
