//String buffer methods 1.append 2.insert 3.replace 4.delete 5.reverse 6.capacity(16 default)updates by default*2+2;

class test
{
public static void main(String[]args)
{

StringBuffer sb = new StringBuffer("sahil ");

System.out.println(sb);
sb.append("footballer and also a software devloper who loves to code as well as do gym ");
System.out.println(sb);

sb.insert(6,"is ");
System.out.println(sb);

sb.replace(6,8,"the");
System.out.println(sb);

sb.delete(6,9);
System.out.println(sb);

sb.reverse();
System.out.println(sb);

System.out.println(sb.capacity());

}
}
