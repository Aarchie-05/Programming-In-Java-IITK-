import java.util.Scanner;
public class Exercise1_3 
{
       public static void main(String[] args) 
       {
	      Scanner sc = new Scanner(System.in);
	      int n=sc.nextInt();
	      int sum=0;
	      int i=0 , c=0;
          while(c<=n)
          {
            if(i%3==0)
              sum+=i;
            i=i+2;
            c++;
          }
          System.out.print(sum);
       }
}