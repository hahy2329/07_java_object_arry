package step7_01.objectArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StudentEx_풀이{
	String id;
	String pw;
	
	void printData() {
		System.out.println("이름 : " + id + "비밀번호 : "+ pw );
	}
}	

class Controller_풀이{
	StudentEx_풀이[] list = null;
	int stdCnt = 0;
	
	
	
	//추가 메서드 
	void addStudentEx_풀이(StudentEx_풀이 st) {
		if(stdCnt == 0) {
			list = new StudentEx_풀이[1];
		}
		
		else if(stdCnt > 0) {
			StudentEx_풀이[] temp = list;
			list = new StudentEx_풀이[stdCnt+1];
			for (int i = 0; i < stdCnt; i++) {
				list[i] = temp[i];
			}
			temp = null;
		}
		
		list[stdCnt] = st;
		stdCnt++;
	}
	
	
	StudentEx_풀이 removeStudentEx_풀이(int index) {
		StudentEx_풀이 deleteObj = list[index];
		if(stdCnt == 1) {
			list = null;
		}
		else if(stdCnt > 1 ) {
			StudentEx_풀이[] temp = list;
			list = new StudentEx_풀이[stdCnt -1];
			for (int i = 0; i < index; i++) {
				list[i] = temp[i];
				
			}
			
			for (int i = index; i < stdCnt-1; i++) {
				list[i] = temp[i+1];
			}
			
			temp = null;
			
		}
		
		stdCnt--;
		
		return deleteObj;
	}
	
	int checkId(StudentEx_풀이 st) {
		int check = -1;
		for (int i = 0; i < stdCnt; i++) {
			if(list[i].id.equals(st.id)) {
				check = i;
				break;
			}
		}
		return check;
		
	}
	
	
	void printStudentEx_풀이() {
		for (int i = 0; i < stdCnt; i++) {
			list[i].printData();
		}
	}
	
	
	
	String outData() {
		String data = "";
		if(stdCnt == 0) {
			return data;
		}
		
		data += stdCnt;
		data += "\n";
		for (int i = 0; i < stdCnt; i++) {
			data+=list[i].id;
			data += ",";
			data += list[i].pw;
			if(stdCnt -1 !=i) {
				data +="\n";
			}
		}
		return data;
		
		
		
	}
	
	
	void sortData() {
		for (int i = 0; i < stdCnt; i++) {
			for (int j = 0; j < stdCnt; j++) {
				if(list[i].id.compareTo(list[j].id)>0) {
					StudentEx_풀이 temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	
	
	void loadStudentEx_풀이(StudentEx_풀이[] temp,int count) {
		this.stdCnt = count;
		this.list = temp;
	}
	
	
	
}


public class ObjectArrayEx09_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller_풀이 controller1 = new Controller_풀이();
		
		
		String fileName = "student_db.txt";
		
		while(true) {
			
			System.out.println("1.가입, 2.탈퇴, 3.정렬, 4.출력, 5.저장, 6.로드, 7.종료");
			int sel = scan.nextInt();
			
			if(sel ==1) {
				StudentEx_풀이 temp = new StudentEx_풀이();
				System.out.println("[가입] id를 입력하세요.");
				temp.id = scan.next();
				int check = controller1.checkId(temp);
				
				if(check == -1) {
					System.out.println("[가입] pw를 입력해주세요.");
					temp.pw = scan.next();
					controller1.addStudentEx_풀이(temp);
					System.out.println(temp.id + "님 가입을 축하합니다.");
				}
				else {
					System.out.println("중복 아이디 입니다.");
				}
				
			}
			
			else if(sel == 2) {
				controller1.printStudentEx_풀이();
				
				StudentEx_풀이 temp = new StudentEx_풀이();
				System.out.println("[탈퇴] id를 입력하세요.");
				temp.id = scan.next();
				int check = controller1.checkId(temp);
				if(check == -1) {
					System.out.println("없는 아이디입니다.");
				}
				else {
					StudentEx_풀이 del_st = controller1.removeStudentEx_풀이(check);
					System.out.println(del_st.id +"님 탈퇴 되었습니다.");
				}
			}
			else if(sel == 3) {
				
				controller1.sortData();
				controller1.printStudentEx_풀이();
			}
			
			else if(sel ==4 ) {
				controller1.printStudentEx_풀이();
			}
			
			else if(sel == 5) {
				if(controller1.stdCnt ==0 ) {
					continue;
				}
				FileWriter fw = null;
				
				try {
					fw = new FileWriter(fileName);
					String data = controller1.outData();
					if(!data.equals("")) {
						fw.write(data);
						System.out.println(data);
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {fw.close();}catch(IOException e) {e.printStackTrace();}
						
					
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
						
						String line = br.readLine();
						int count = Integer.parseInt(line);
						StudentEx_풀이[] temp = new StudentEx_풀이[count];
						
						for (int i = 0; i < count; i++) {
							temp[i] = new StudentEx_풀이();
							line = br.readLine();
							String[] value = line.split(",");
							temp[i].id = value[0];
							temp[i].pw =  value[1];
							
						}
						controller1.loadStudentEx_풀이(temp, count);
						
					}
					controller1.printStudentEx_풀이();
					
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					try {br.close();}catch(IOException e) {e.printStackTrace();}
					try {fr.close();}catch(IOException e) {e.printStackTrace();}
				}
				}
			
			else if(sel == 7) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
				
				
			}
			
			
			
			
			
		}
		scan.close();
	}

}
