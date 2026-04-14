class test 
{
public static void main(String[]args)
{

int count = 0;
String s1 = "i hate jcb cause i love my family car";
System.out.println("given string"+ s1);
String w[] =s1.split("\\s");

for(String p:w)
{
count++;
System.out.println(p);
}
System.out.println("no of words are"+count);
}
}