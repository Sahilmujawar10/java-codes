import java.util.*;
class test
{
public static void main(String[]args)
{
	PriorityQueue<String>h = new PriorityQueue<String>();

h.add("sahil");
h.add("aman");
h.add("raj"); 
h.add("yash");
h.add("akshay");
h.add("rohit");
System.out.println(h.size());

// h.pollFirst(); // removes fist value
// h.pollLast(); // removes last value
h.element();
h.poll();
//h.offer();
System.out.println("peek is"+" "+h.peek());
System.out.println("the queue is"+" "+h);

 PriorityQueue<String>h1 = new PriorityQueue<String>();

h1.add("sakshi");
h1.add("alfiya"); 
h1.add("saba");
h1.add("dollyyy");
h1.add("vaishnavi");

System.out.println("offer method is"+" "+h1);
System.out.println(h1);
h.addAll(h1);// add all two list elements together
//h.removeAll(h1);//removes all from h1 that added with h
System.out.println("the school friends are"+" "+h);


h.removeIf(str->str.contains("rohit"));
System.out.println(h);
}
}
