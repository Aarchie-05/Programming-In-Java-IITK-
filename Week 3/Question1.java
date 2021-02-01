import java.util.Scanner;
public class Fibonacci { 
public static void main(String args[]) { 
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
    System.out.println(fib(n));
} 
static int fib(int n) {
    if(n==1||n==0)
      return 0;
    else if(n==2)
      return 1;
    else
      return fib(n-2)+fib(n-1);
   }
}