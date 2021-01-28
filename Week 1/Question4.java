import java.util.Scanner;
public class Exercise1_4 
{
    public static void main(String[] args) 
    {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
       int result=0;
       int num= n;
       int c=0;
       while(num!=0){
          c++;
          num/=10;
       }
       int sum = 0;
       num = n;
       while(n!=0){
          sum+=Math.pow(n%10,c);
          n/=10;
       }
       if(num==sum)
          System.out.print(1);
       else
          System.out.print(0);
    }
}