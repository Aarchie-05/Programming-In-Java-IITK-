//Prefixed Fixed Code:
import java.util.*;
public class Question5_4{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int length = sc.nextInt(); 
    // create an array to save user input 
    int[] name = new int[length];
    int sum=0;//save the total sum of the array.
    for(int i=0;i<length;i++){
    try{
      name[i] = sc.nextInt();
      sum += name[i];
    }
    catch(InputMismatchException e){
      sum = 0;
    }
  }
  if(sum == 0){
      System.out.print("You entered bad data.");
  }
  else{
      System.out.print(sum);
  }
 }
}