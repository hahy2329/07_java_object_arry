package step7_01.objectArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

// DTO (DataTransferObject) : 데이터 전송 모델 객체
class StudentDTO_풀이{
	String id;
	String pw;
	
	void printData1() {
		System.out.println("이름 : " + this.id + " 비밀번호 : " + this.pw);
	}
	
}

class StudentController_풀이{
	ArrayList<StudentDTO_풀이> studentList = new ArrayList<StudentDTO_풀이>();
	
	void addStudent(StudentDTO_풀이 studentDTO) {
		studentList.add(studentDTO);
	}
	
	int checkID(StudentDTO_풀이 st) {
		
		int check = -1;
		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).id.equals(st.id)) {
				check = i;
				break;
			}
			
		}
		return check;
	}
	
	void printStudent() {
		for (int i = 0; i < studentList.size(); i++) {
			studentList.get(i).printData1();
			
		}
	}
	
	StudentDTO_풀이 removeStudent(int index) {
		StudentDTO_풀이 del_st = studentList.get(index);
		studentList.remove(index);
		return del_st;
	}
	
	void sortData() { // 오름차순으로 정렬해보자
		
		
		for (int i = 0; i < studentList.size(); i++) {
			for (int j = 0; j < studentList.size(); j++) {
				if(studentList.get(i).id.compareTo(studentList.get(j).id)>0) {
					StudentDTO_풀이 temp = new StudentDTO_풀이();
					temp = studentList.get(j);
					studentList.set(i, studentList.get(i));
					studentList.set(j, temp);
					
					
				
				}
				
			}
			
		}
				
		
	}
	
	int getSize() {
		return studentList.size();
	}
	
	String outData() {
		
		String data = "";
		int count = studentList.size();
		if(count == 0) {
			return data;
		}
		data +=count;
		data +="\n";
		for (int i = 0; i < studentList.size(); i++) {
			data += studentList.get(i).id;
			data +=",";
			data += studentList.get(i).pw;
			if(count -1 != i) {
				data += "\n";
			}
		}
		return data;
		
	}
	
	void loadStudent(ArrayList<StudentDTO_풀이> studentList) {
		this.studentList = studentList;
	}
	
	
	
}



public class ObjectArrayEx14_풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		StudentController_풀이 controller1 = new StudentController_풀이();
		
		String fileName = "student_arraylist_db.txt";
		
		
		while(true) {
			System.out.println("1.가입, 2.탈퇴, 3.정렬, 4.출력, 5.저장, 6.로드, 7.종료 ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				StudentDTO_풀이 temp = new StudentDTO_풀이();
				System.out.println("[가입] id를 입력하세요.");
				temp.id  = scan.next();
				int check = controller1.checkID(temp);
				
				if(check == -1) {
					System.out.println("[가입] pw를 입력하세요.");
					temp.pw = scan.next();
					controller1.addStudent(temp);
					System.out.println(temp.id+"님 가입을 환영합니다.");
				}
				
				else {
					System.out.println("중복아이디 입니다.");
				}
				
				
			}
			
			else if(sel == 2) {
				controller1.printStudent();
				
				StudentDTO_풀이 temp = new StudentDTO_풀이();
				System.out.println("[탈퇴] id를 입력하세요. ");
				temp.id = scan.next();
				
				int check = controller1.checkID(temp);
				if(check == -1) {
					System.out.println("없는 아이디입니다.");
				}
				
				else {
					StudentDTO_풀이 del_st = controller1.removeStudent(check);
					System.out.println(del_st.id + "님 탈퇴 되었습니다.");
				}
				
				
			}
			
			else if(sel == 3) {
				controller1.sortData();
				controller1.printStudent();
			}
			
			else if(sel == 4) {
				controller1.printStudent();
			}
			
			
			else if(sel == 5) {
				
				FileWriter fw = null;
				
				if(controller1.getSize() == 0) {
					continue;
				}
				
				else {
					try {
						fw = new FileWriter(fileName);
						String data = controller1.outData();
						
						if(!data.equals("")) {
							fw.write(data);
						}
					} catch (Exception e) {
						
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
						ArrayList<StudentDTO_풀이> studentList = new ArrayList<StudentDTO_풀이>();
						
						
						String line = br.readLine();
						int count = Integer.parseInt(line);
						
						for(int i = 0; i<count; i++) {
							StudentDTO_풀이 temp = new StudentDTO_풀이();
							line = br.readLine();
							String[] value = line.split(",");
							temp.id = value[0];
							temp.pw = value[1];
							studentList.add(temp);
							
						}
						controller1.loadStudent(studentList);
					}
					controller1.printStudent();
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {br.close();}catch(IOException e) {e.printStackTrace();}
					try {fr.close();}catch(IOException e) {e.printStackTrace();}
				}
				
				
			}
			else if(sel == 7) {
				System.out.println("종료");
				break;
			}
					
					
		}
		
		scan.close();
		
		
	

	}

}
