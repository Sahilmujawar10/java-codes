import javax.swing.*;

class checkn
{

public static void main(String [] args)
{

String n1 = JOptionPane.showInputDialog("Enter the number");
int a = Integer.parseInt(n1);

System.out.println(a);

if(a>0){

System.out.println(a + "is a positive number");

}

else if(a<0){

System.out.println(a+"is a negative number");
}

else{

System.out.println(a + "is a zero");
}
}
}