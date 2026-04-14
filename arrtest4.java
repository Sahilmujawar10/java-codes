import java.util.*;

class test
{

public static void main(String[]args)
{

int arr[] = {10,20,30,40,50};
int key = 30;

for(int i =0;i<arr.length;i++)
{
if(key == arr[i])
{
System.out.println("the key is present at index:"+" "+i);
}
}
}
}