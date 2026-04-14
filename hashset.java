import java.util.*;
class test
{
public static void main(String[]args)
{
HashSet<String>h = new HashSet<String>();

h.add("sahil");
h.add("raj"); 
h.add("yash");
h.add("akshay");
h.add("rohit");
System.out.println(h.size());
System.out.println(h);


HashSet<String>h1 = new HashSet<String>();

h1.add("sakshi");
h1.add("alfiya"); 
h1.add("saba");
h1.add("dollyyy");
h1.add("vaishnavi");


System.out.println(h1);
h.addAll(h1);// add all two list elements together
//h.removeAll(h1);//removes all from h1 that added with h
System.out.println("the school friends are"+" "+h);

h.removeIf(str->str.contains("rohit"));
System.out.println(h);
}
}
