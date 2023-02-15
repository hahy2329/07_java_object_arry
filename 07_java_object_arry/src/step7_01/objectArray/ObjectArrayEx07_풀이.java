package step7_01.objectArray;

//# 클래스 배열 응용

class Subject_풀이{
	
	String name;
	int score;
	
}


class Student_풀이{
	
	Subject_풀이[] subjects;	// Subject 객체를 담을 클래스 배열
	String name;
	
}


public class ObjectArrayEx07_풀이 {

	public static void main(String[] args) {
		
		Student_풀이 student1 = new Student_풀이();
		
		Subject_풀이[] subject1 = new Subject_풀이[2];
		student1.subjects = new Subject_풀이[2];
		student1.subjects = subject1;
		for (int i = 0; i < subject1.length; i++) {
			subject1[i] = new Subject_풀이();
			
		}
		
		subject1[0].name ="국어";
		subject1[0].score = 80;
		
		subject1[1].name = "수학";
		subject1[1].score = 100;
		
		for (int i = 0; i < student1.subjects.length; i++) {
			System.out.println(student1.subjects[i].name+ " : " + student1.subjects[i].score);
			System.out.println("=======");
		}
		
		
		
	
		
	}

}
