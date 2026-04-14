class test
//reverse code also in  
{
public static void main(String[]args)
{

String s1 = "i love my bike";
System.out.println("given string is"+ s1);

char ch[] = s1.toCharArray();

for(int i=ch.length-1;i>0;i--)
{
System.out.println(ch[i]);
}
}
}
