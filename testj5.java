class player
{

private String name,position;
private int goals;
static String sport ="FootBall";

static void change()
{
	sport = "hockey";
}
public player(String nm, int g)
{
name = nm;
goals = g;
}

public void showdata()
{

System.out.println("the player name is"+" "+name);
System.out.println("the sports name is"+" "+sport);
System.out.println("the goals scored by"+" "+name+" "+" "+goals);
}
}

class test 
{
 public static void main(String[]args)
 {
 
 
 player p;
 player.change();
 p = new player("sahil",4);
 p.showdata();
 
 System.out.println(" ");
 
 player p1;
 p1 = new player("rohit",5);
 p1.showdata();
 
  System.out.println(" ");
 
 player p2;
 p2 = new player("raj",2);
 p2.showdata();
 }
}


