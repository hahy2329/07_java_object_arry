package step7_01.objectArray;

//# 클래스 배열 응용

class Subject_풀이3{
	
	String name;
	int score;
	
}


class Student_풀이3{
	
	Subject_풀이3[] subjects;	// Subject 객체를 담을 클래스 배열
	String name;
	
}


public class ObjectArrayEx07_풀이3 {

	public static void main(String[] args) {
		
		Student_풀이3[] studentList = new Student_풀이3[3];
		studentList[0] = new Student_풀이3();
		studentList[0].name = "학생0";
		studentList[0].subjects = new Subject_풀이3[3];
		
		for (int i = 0; i < 3; i++) {
			studentList[0].subjects[i] = new Subject_풀이3();
			studentList[0].subjects[i].name = "학생0 과목"+i+"";
			studentList[0].subjects[i].score = 100;
		}
		
		
		studentList[1] = new Student_풀이3();
		studentList[1].name = "학생1";
		studentList[1].subjects = new Subject_풀이3[2];
		studentList[1].subjects[0] = new Subject_풀이3();
		studentList[1].subjects[0].name = "학생1 과목0";
		studentList[1].subjects[0].score = 100;
		
		
		studentList[1].subjects[1] = new Subject_풀이3();
		studentList[1].subjects[1].name = "학생1 과목1";
		studentList[1].subjects[1].score = 100;
		
		
		studentList[2] = new Student_풀이3();
		studentList[2].name = "학생2";
		studentList[2].subjects = new Subject_풀이3[1];
		studentList[2].subjects[0] = new Subject_풀이3();
		studentList[2].subjects[0].name = "학생2 과목1";
		studentList[2].subjects[0].score = 100;
		
		
		for (int i = 0; i < studentList.length; i++) {
			System.out.println("----" + studentList[i].name +"---" );
			for (int j = 0; j < studentList[i].subjects.length; j++) {
				System.out.println(studentList[i].subjects[j].name + " / "+studentList[i].subjects[j].score);
			}
			System.out.println();
		}
		
		
	}

}
