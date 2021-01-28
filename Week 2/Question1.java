class School { 
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
} 
class Student { 
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}

public class Question212{ 
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.print();
        School obj2 = new School();
        obj2.print();
    }
}
