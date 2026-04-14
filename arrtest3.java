import java.util.*;

class test
{
public static void main(String[]args)
{

int sum = 0;
int arr[] = {12,34,59,45,22};

for(int i=0;i<arr.length;i++)
{
 
if(arr[i]%2!=0)
{	
sum = sum + arr[i];
System.out.println("sum of odd numebrs are"+" "+sum);

}
}
}
}