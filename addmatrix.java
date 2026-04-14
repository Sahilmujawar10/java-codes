class test 
{
public static void main(String[]args)
{

int a[][] = {{2,4},{5,1}};
int b[][] = {{4,2},{3,6}};
int c[][] = new int[2][2];

for(int n=0;n<2;n++)
{
for(int i=0;i<2;i++)
{	
c[n][i] = a[n] * b[i][n];
System.out.print(c[n][i]+" ");
}

System.out.println();
}
}
}
