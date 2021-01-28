public class Question213{ 
    public static void main(String[] args) { 
		Question213 q = new Question213();
		q.studentMethod();
    }
	
	void print(Question213 object){
		System.out.print("Well Done!");
	}
    void studentMethod(){
        Question213 q = new Question213();
        q.print(q);
    }
}