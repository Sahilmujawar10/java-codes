import java.util.*;
class test 
{

public static void main(String[]args)
{

TreeMap<Integer,String>t = new TreeMap<Integer,String>();


t.put(4,"bhumra");
t.put(2,"raj");
t.put(1,"sahil");
t.put(3,"aman");


System.out.println(t.descendingMap());
System.out.println("the tree map is:"+" "+t);

System.out.println("the head of 2"+" "+t.headMap(2));
System.out.println("the tail of 2"+" "+t.tailMap(2,true));
System.out.println("the submap of 1 to 4"+" "+t.subMap(1,4));


 }
}
