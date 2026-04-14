class factorial
{

public static void main(String []args)
{
	
 int n = 16;  // Fixed number
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }


System.out.println(fact);
}
}
