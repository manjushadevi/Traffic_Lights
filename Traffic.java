/** Name:Manjusha
* Description : To stimulate a traffic light
* Date: 13/03/2021
*/
import java.io.*;
import java.util.*;
class Traffic
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter light");
String light = s.nextLine();
if(light.equals("Red"))
{
System.out.println("stop");
}
else if(light.equals("Green"))
{
System.out.println("go");
}
else if(light.equals("Yellow"))
{
System.out.println("Ready");
}
else
{
System.out.println("No value");
}
}
}