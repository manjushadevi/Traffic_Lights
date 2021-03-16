/**name : Manjusha
*Description: Fibonacci series from 1 to n
*Date:13/03/2021
*/
import java.util.Scanner;
import java.lang.StringBuilder;

public class FibonacciDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String series = "";
		//StringBuilder sb = new StringBuilder(series);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		series = fib(num);
		System.out.println("The series: "+ series);
		}

	private static String fib(int num) {
		int i = 1;
		int nt = 0, t1 = 0, t2 = 1;
		String list = "";
		StringBuilder sb = new StringBuilder(list);
		while(i<=num){
			sb.append(t1+" ");
			nt = t1 + t2;
			t1 = t2;
			t2 = nt;
			i++;
			}
		String single = sb.toString();
		return single;
	}
