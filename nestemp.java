import javax.swing.*;

class nestemp
{

public static void main(String []args)
{

String name = JOptionPane.showInputDialog("Enter the name of employe");
String id = JOptionPane.showInputDialog("Enter the id of employe");
String wadges = JOptionPane.showInputDialog("wadges");
String workd = JOptionPane.showInputDialog("work days filled");

int i = Integer.parseInt(id);
int w = Integer.parseInt(wadges);
int wd = Integer.parseInt(workd);

int pay = w*wd;

System.out.println("the name of employe"+ name);
System.out.println("the id of employe" + id);
System.out.println("the calculated payment is" + pay);

double bonus = pay*0.10;
double pwb = bonus + pay;


if(wd>25)
{
System.out.println("salary after bonus"+pwb);


if(pwb>10000)
{
double inc = pwb + 1000;
System.out.println("salary after insentiv"+inc);


}
}
else{
}

}
}


