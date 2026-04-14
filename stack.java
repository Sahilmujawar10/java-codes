import java.util.*;
class test
{
public static void main(String[]args)
{
Stack<String>AL = new Stack<String>();

AL.push("sahil");
AL.push("raj");
AL.push("akshay");
AL.push("yash");
AL.push("rohit");


//Collections.sort(AL);// sorts the element in list


System.out.println("the friends are"+" "+AL);
System.out.println("the friends are"+" "+AL.size());

boolean s = AL.empty();
System.out.println("is stack empty"+" "+s);
AL.pop();
System.out.println("after pop stack is"+" "+AL);
System.out.println("top element is  "+" "+AL.peek());

int loc = AL.search("yash");
System.out.println("loc of raj is"+" "+loc);
}
}
