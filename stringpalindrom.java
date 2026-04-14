class test 
{
public static void main(String[]args)
{

String s1 = "i love my bike";
String s2 = " ";
System.out.println("the given string is"+ s1);

char ch[] = s1.toCharArray();

for(int i=ch.length-1;i>0;i--)
{
s2 = s2+ch[i];
}

if(s1.equals(s2))
{
System.out.println(s1+"String is palindrom");
}
else
{
System.out.println(s1+"String is not palindrom");
}
}
}

