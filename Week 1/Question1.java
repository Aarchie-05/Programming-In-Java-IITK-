import java.util.Scanner;  
public class Exercise1_1 
{
    public static void main(String[] args) 
    {
       Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
       if(radius!=0 && radius>0)
       {
           //Calculating Area
           perimeter = 2*Math.PI*radius;
           //Calculating Perimeter
           area = Math.PI*radius*radius;
           System.out.println(perimeter);
           System.out.print(area);
       }
       else
       {
           System.out.println("please enter non zero positive number");
       }
    }
}