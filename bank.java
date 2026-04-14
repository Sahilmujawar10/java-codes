import javax.swing.*;
class bank
{

public static void main(String []args)
{

String name = JOptionPane.showInputDialog("Enter name");
String age = JOptionPane.showInputDialog("Enter age");

int a = Integer.parseInt(age);

if(a>18 && a<60){

System.out.println(name + "u are eligible for vote");

}

else{

System.out.println("ops u are not eligible" +name);
}
}
}