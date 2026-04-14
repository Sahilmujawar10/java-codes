import java.util.*;
class test 
{

public static void main(String[]args)
{

ArrayDeque<String> ad = new ArrayDeque<String>();

ad.add("sahil");
ad.add("raj");
ad.add("rohit");
ad.add("yash");
ad.add("akshay");

System.out.println("the array deque is"+" "+ad.offerFirst("ram"));
System.out.println("the array deque is"+" "+ad.pollLast());

System.out.println("the array deque is"+" "+ad);


}
}
