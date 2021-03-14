/** Name:Manjusha
* Description: To find the sum of the cubes of the digit of an n digit number
* Date : 13/03/2021
*/
import java.io.*;
import java.util.*;
class SumOfCubes
{
static int rem;
static int sum=0;
public static int sum(int n)
{

while(n!=0)
{

rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
return sum;
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

System.out.println("enter a number");
int n=s.nextInt();
int result=sum(n);
System.out.println("result "+result);
}
}
