import java.util.*;
class test
{
public static void main(String[]args)
{

HashMap<Integer,String>h = new HashMap<Integer,String>();

h.put(1,"messi");
h.put(2,"ronaldo");
h.put(3,"neymar");
h.put(4,"kaka");

for(Map.Entry g:h.entrySet())
{
	System.out.println(g.getKey()+" "+g.getValue());
}



HashMap<Integer,String>h1 = new HashMap<Integer,String>();

h1.put(5,"marcelo");
h1.put(6,"rooney");
h1.put(7,"bale");
h1.put(8,"yamal");

for(Map.Entry s:h1.entrySet())
{
	System.out.println(s.getKey()+" "+s.getValue());
}
 h.putAll(h1);
 

System.out.println("the map after add"+h);
System.out.println("is map contains key"+h.containsKey(2));
System.out.println("is map contains value"+h.containsValue("ronaldino"));

h.putIfAbsent(9,"deJong");
System.out.println("the map after add"+h);
h.clear();

System.out.println("after clear"+h);



}
}


