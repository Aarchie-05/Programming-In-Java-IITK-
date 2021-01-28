import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        s = input.nextInt();
        int[] arr = new int[s];   
        for(i=0;i<arr.length;i++){
	       arr[i]=input.nextInt();
        }
        result = arr[0];
        int sum = 0;
        for(i=0;i<s;i++){
            if(arr[i]>result)
               result = arr[i];
            sum += arr[i];
        }
        mark_avg = sum/s;
        System.out.println(result);
        System.out.print(mark_avg);
    }
}