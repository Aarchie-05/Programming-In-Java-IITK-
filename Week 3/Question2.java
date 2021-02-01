import java.util.Scanner;

public class Circle extends Point{
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 Point p1=new Point();
	 p1.x=sc.nextDouble();
	 p1.y=sc.nextDouble();
	 Point p2=new Point();
	 p2.x=sc.nextDouble();
	 p2.y=sc.nextDouble(); 
	 Circle c1=new Circle();
	 c1.distance(p1,p2);
  }

}
class Point{
  double x;
  double y;
  double distance(Point p1,Point p2){
    double d = Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
    System.out.println(d);
    return d;
  }
}