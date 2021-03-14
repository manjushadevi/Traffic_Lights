/** Name:Manjusha
* Description: To print the prime numbers upto n number
* Date : 13/03/2021
*/
import java.io.*;
import java.util.*;
class PrimeNumber
{
public static void main(String args[])
{
int i,n,count;
System.out.println("enter number");
Scanner s=new Scanner(System.in);
n = s.nextInt();
System.out.println("prime numbers upto "+n+"are ");
for(int j=2;j<=n;j++)
{
count=0;
for(i=1;i<=j;i++)
{
if(j%i==0)
{
count++;
}
}
if(count == 2)
{
System.out.println(j+" ");
}
}
}
}
