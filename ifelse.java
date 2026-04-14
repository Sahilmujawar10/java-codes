import javax.swing.*;
class ifelse
{

public static void main(String []args)
{

String name = JOptionPane.showInputDialog("Enter name");
String age = JOptionPane.showInputDialog("Enter age");

int a = Integer.parseInt(age);

if(a>21){

System.out.println(name + "u are eligible for nikha");

}

else{

System.out.println("ops u are not eligible" +name);
}
}
}
