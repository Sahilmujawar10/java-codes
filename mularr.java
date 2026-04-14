class test 
{
public static void main(String[]args)
{

int a[][] = {{2,4},{5,1}};
int b[][] = {{4,2},{3,6}};
int c[][] = new int[2][2];

for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
for(int k=0;k<2;k++)
{
c[i][j] = c[i][j]+ a[i][k]*b[k][j];
}
System.out.print(c[i][j] + " ");
}
System.out.println();
}
}
}
