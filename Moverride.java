 class baseclass 
 {
 public void method()
 {
 
 System.out.println("hey iam parentclass");
 }
 }
 
 class child extends baseclass
 {
 public void method()
 {
 
 System.out.println("hey iam child class");
 }
 }
 
 class test
 {
 public static void main(String[]args)
 {
 
 baseclass b;
 
 b= new baseclass();
 b.method();
 
 child c;
 
 c = new child();
 c.method();
 
 baseclass b1 = new child();
 b1.method();
 }
 }
 
 