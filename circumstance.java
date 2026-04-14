import javax.swing.*;

class circumstance
{

public static void main(String[]args)
{

String radius = JOptionPane.showInputDialog("enter the radius");
int r = Integer.parseInt(radius);

double a = 3.14*r*r;
double cir = 2*3.14*r;

System.out.println("the radius of cirlce is " + a);
System.out.println("the circumstance of a circle is " + cir);

}
}
