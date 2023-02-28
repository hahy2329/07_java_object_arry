package step7_01.objectArray;

import java.util.ArrayList;
import java.util.Scanner;

class StudentDTO2{
	
	String id;
	String pw;
	
	void printData() {
		System.out.println("이름: " + this.id + "비밀번호 : " + this.pw);
	}
}

class StudentController2{
	
	ArrayList<StudentDTO2> studentList1 = new ArrayList<StudentDTO2>();
	
	
	int checkId(String id) {
		int checkId = -1;
		
		for (int i = 0; i < studentList1.size(); i++) {
			if(id.equals(studentList1.get(i).id)) {
				checkId = i;
			}
			
		}
		
		return checkId;
		
	}
	
	void addStudent(StudentDTO2 studentDTO2) {
		studentList1.add(studentDTO2);
	}
	
}

public class AlonePractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentController2 controller = new StudentController2();
		
		String fileName = "student_arraylist_db.txt";
		
		while (true) {
			
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				StudentDTO2 user = new StudentDTO2();
				int check = controller.studentList1.size();
				
				System.out.println("[가입]id를 적어주세요.");
				user.id = scan.next();
				
				if(check == 0) {
					System.out.println("[가입]pw를 적어주세요.");
					user.pw = scan.next();
					controller.addStudent(user);
					System.out.println(user.id + "님 가입 축하드립니다.");
				}
				
				else {
					int checkId = controller.checkId(user.id);
					
					if(checkId != -1) {
						System.out.println("[메세지] 가입된 id입니다.");
						continue;
					}
					
					else {
						
						System.out.println("[가입]pw를 적어주세요.");
						user.pw = scan.next();
						controller.addStudent(user);
						System.out.println(user.id + "님 가입 축하드립니다.");
						
						
					}
				}
			}
			
			else if(sel == 2) {
				
				
				
			}
		}
	}

}
