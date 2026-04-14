// add,remove,size of list,sorts the elements in list,checked list is empty or not/ set() means replace the element

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

//AL.set(1,"disha");
AL.add(1,"disha");
Collections.sort(AL);// sorts the element in list


System.out.println("the friends are"+" "+AL);

Vector<String>AL1 = new Vector<String>();

AL1.add("govind");
AL1.add("viraj");
AL1.add("siraj"); 	
AL1.add("sumit");
AL1.remove("govind");// to remove elements from list
System.out.println("list after removing govind"+" "+AL1);
System.out.println("the friends are"+" "+AL1);
AL.addAll(AL1);// add all two list elements together
System.out.println("the school friends are"+" "+AL);
System.out.println("is list empty?"+" "+AL1.isEmpty());
//System.out.println("the size of all friends list is"+" "+AL.sizesize());// calculate the size of list 
}
}
