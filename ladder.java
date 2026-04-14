import javax.swing.*;

class ladder
{

public static void main(String [] args)
{

String n1 = JOptionPane.showInputDialog("Enter first number");
String n2 = JOptionPane.showInputDialog("Enter second number");

int a = Integer.parseInt(n1);
int b = Integer.parseInt(n2);

System.out.println("first number is :" + a);
System.out.println("second number is:"+ b);


if(a>b){

System.out.println(a);
}

else if(b>a)
{

System.out.println(b);
}

else{

System.out.println("both are eqal");
}
}
}
