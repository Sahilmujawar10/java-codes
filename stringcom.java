class test 
{
public static void main(String[]args)
{

String s1 = "splendor";
String s2 = "ather";

String s4 = new String("splendor");
String s3 = "splendor";

System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));

System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1==s4);

System.out.println(s1.compareTo(s2));
System.out.println(s1.compareTo(s3));
System.out.println(s1.compareTo(s4));
}
}


