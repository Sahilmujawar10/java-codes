//removeAll elements in list , to check element is present or not in the list,each element below (loop)

import java.util.*;
class test
{
public static void main(String[]args)
{
LinkedList<String>AL = new LinkedList<String>();

AL.add("sahil");
AL.add("raj");
AL.add("yash");
AL.add("akshay");
AL.add("rohit");



for(String s:AL)
{
	System.out.println(s);
}
System.out.println("the list "+" "+AL);
System.out.println("yash is in the list ?"+" "+AL.contains("yash"));// to get the element from list
System.out.println("fav in list"+" "+AL.get(1));


Vector<String>AL1 = new Vector<String>();

AL1.add("govind");
AL1.add("viraj");
AL1.add("siraj");
AL1.add("sumit");

AL.removeAll(AL1);
System.out.println("after removed list"+" "+AL1);//removeAll elements in the list 

}
}
