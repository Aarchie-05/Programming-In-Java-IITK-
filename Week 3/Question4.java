import java.util.Scanner;
class QuestionScope {
int sum(int a, int b){
        return a + b;
    }
static int multiply(int a, int b){
        return a * b;
    }
}
public class Test3{
public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
        QuestionScope obj = new QuestionScope();
        System.out.println(obj.sum(n1,n2));
        System.out.println(obj.multiply(n1,n2));
    }
}