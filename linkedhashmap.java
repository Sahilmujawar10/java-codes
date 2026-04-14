import java.util.*;

class test
{

public static void main(String[]args)
{

LinkedHashMap<Integer,String> m = new LinkedHashMap<Integer,String>();

m.put(1,"sahil");
m.put(2,"juned");
m.put(3,"raj");
m.put(4,"akshay");

for(Map.Entry g:m.entrySet())
{
System.out.println(g.getKey()+" "+g.getValue());
}


HashMap<Integer,String>h = new HashMap<Integer,String>();

h.put(5,"messi");
h.put(6,"ronaldo");
h.put(7,"neymar");
h.put(8,"kaka");

for(Map.Entry g:h.entrySet())
{
	System.out.println(g.getKey()+" "+g.getValue());
}

m.putAll(h);


System.out.println("is map empty"+" "+m.isEmpty());
System.out.println("after adding two maps"+" "+m);

}
}
