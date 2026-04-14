import java.util.*;
class test
{
public static void main(String[]args)
{
Vector<String>AL = new Vector<String>();

AL.add("sahil");
AL.add("raj");
AL.add("akshay");
AL.add("yash");
AL.add("rohit");
AL.add("alfiya");
AL.add("sakshi");
AL.add("suyash");
AL.add("disha");
AL.add("dolly");
AL.add("saloni");
AL.add("suhani");
AL.add("lakshya");
AL.add("atul");	
AL.addElement("sam");
//Collections.sort(AL);// sorts the element in list


System.out.println("the friends are"+" "+AL);
AL.removeIf(Str->Str.contains("raj"));
AL.removeElementAt(3);
System.out.println("the friends are"+" "+AL);
System.out.println("the friends are"+" "+AL.hashCode());
System.out.println("the friends are"+" "+AL.capacity());


}
}
