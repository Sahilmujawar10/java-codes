import javax.swing.*;

class employe
{

public static void main(String []args)
{

String ename = JOptionPane.showInputDialog("enter employe name");
String id = JOptionPane.showInputDialog("enter id name");
String wages = JOptionPane.showInputDialog("daily payment");
String days = JOptionPane.showInputDialog("days filled");

int i = Integer.parseInt(id);
int wd = Integer.parseInt(wages);
int d = Integer.parseInt(days);

int payment = wd*d;

System.out.println("employename" +ename);
System.out.println("employe id"+i);
System.out.println("employe wages"+wd);
System.out.println("days filled"+d);
System.out.println("one month payment of employee is " + payment);
}
}
