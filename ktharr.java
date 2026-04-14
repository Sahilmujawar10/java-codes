class test 
{
public static void kthelement(int s[], int k)
{

for(int i=0;i<s.length;i++)
{
if(k==s[i])
{
k = s[i];
System.out.println("the kth element is"+k);
}
else{
System.out.println("kth element is not present in the array");
}
}

public static void main(String[]args)
{
int k = 5;
int a ={2,5,1,25,6,7,9};
kthelement(a);
}
}
