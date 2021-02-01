import java.util.Scanner;
class Question 
{ 
    Scanner sc = new Scanner(System.in);
    int e1 = sc.nextInt(); 
    int e2 = sc.nextInt();  
}
public class Question3 {
static void swap(Question q)
{
	int temp;
	temp = q.e1;
	q.e1 = q.e2;
	q.e2 = temp;
}
public static void main(String[] args) {
	Question t = new Question ();
    swap(t);
    System.out.print(t.e1+" "+t.e2);    
  }
}	
	
