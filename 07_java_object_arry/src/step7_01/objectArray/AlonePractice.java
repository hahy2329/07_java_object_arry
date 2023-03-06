package step7_01.objectArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
	
	
	
	void printStudent() {
		for (int i = 0; i < studentList1.size(); i++) {
			System.out.println("id : " + studentList1.get(i).id + " pw : " + studentList1.get(i).pw);
			
			
			
		}
	}
	
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
	
	void loadStudent(ArrayList<StudentDTO2> studentList) {
		this.studentList1 = studentList;
	}
	
	
	
	int removeStudent(StudentDTO2 st) {
		int check = -1;
		
		for (int i = 0; i < studentList1.size(); i++) {
			if(st.id.equals(studentList1.get(i).id) && st.pw.equals(studentList1.get(i).pw)){
				check = i;
			}
		}
		
		
		
		
		return check;
		
	}
	
	String outData() {
		String data = "";
		int count = studentList1.size();
		if(count ==0) {
			return data;
		}
		data += count;
		data +="\n";
		for (int i = 0; i < count; i++) {
			data += studentList1.get(i).id;
			data += ",";
			data +=studentList1.get(i).pw;
			if(count-1 != i) {
				data += "\n";
				
			}
		}
		return data;
	}
	
	
	
	
	StudentDTO2 perfectDelate(int checkId) {
		StudentDTO2 temp = studentList1.get(checkId);
		
		studentList1.remove(checkId);
		
		return temp;
		
		
	}
	
	int getSize() {
		return studentList1.size();
	}
	
	void sortData() {
		for (int i = 0; i < studentList1.size(); i++) {
			for (int j = 0; j < studentList1.size(); j++) {
				if(studentList1.get(i).id.compareTo(studentList1.get(j).id) < 0) {
					StudentDTO2 temp = studentList1.get(i);
					studentList1.set(i, studentList1.get(j));
					studentList1.set(j, temp);
					
					
				}
			}
		}
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
				controller.printStudent();
				
				StudentDTO2 temp = new StudentDTO2();
				System.out.println("[탈퇴] id를 입력해주세요 :");
				temp.id = scan.next();
				System.out.println("[탈퇴] pw를 입력해주세요 : ");
				temp.pw = scan.next();
				
				int checkId = controller.removeStudent(temp);
				
				if(checkId == -1) {
					System.out.println("[메세지] 없는 아이디입니다.");
					
				}
				else {
					StudentDTO2 tmp = controller.perfectDelate(checkId);
					System.out.println(tmp.id +"님 탈퇴 되었습니다.");
					
				}
				
				
				
				
			}
			
			else if(sel == 3) {
				controller.sortData();
				controller.printStudent();
			}
			
			else if(sel == 4) {
				controller.printStudent();
			}
			
			else if(sel == 5) {
				FileWriter fw = null;
				if(controller.getSize() == 0) {
					continue;
				}
				else {
					try {
						fw = new FileWriter(fileName);
						int studentListCount = controller.studentList1.size();
						String data = controller.outData();
						
						if(!data.equals("")) {
							fw.write(data);
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						try {fw.close();}catch(IOException e) { e.printStackTrace();}
					}
						
						
				}
					
				
				
				
				
				
			}
			
			
			else if(sel == 6) {
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					
					File file = new File(fileName);
					
					if(file.exists()) {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						ArrayList<StudentDTO2> studentList = new ArrayList<StudentDTO2>();
						
						
						String line = br.readLine();
						int count = Integer.parseInt(line);
						
						for (int i = 0; i < count; i++) {
							StudentDTO2 temp = new StudentDTO2();
							line = br.readLine();
							String[] value = line.split(",");
							temp.id = value[0];
							temp.pw = value[1];
							studentList.add(temp);
						}
						
						
						controller.loadStudent(studentList);
						
						
						
					}
					
					controller.printStudent();
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {try { br.close();}catch(IOException e) {e.printStackTrace();}
						  try { fr.close();}catch(IOException e) {e.printStackTrace();}
				}
			}
			
			else if(sel == 7) {
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			}
		}
	}

}
