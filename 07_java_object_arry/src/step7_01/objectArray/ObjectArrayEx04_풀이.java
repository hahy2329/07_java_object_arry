package step7_01.objectArray;

import java.util.Scanner;

class User1{
	String id;
	int money;
}

public class ObjectArrayEx04_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		User1[] userList = new User1[100];
		
		for (int i = 0; i < userList.length; i++) {
			userList[i] = new User1();
			
		}
		int usrCnt = 0;
		
		while(true) {
			System.out.println("1.회원가입");
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				User1 temp = new User1();
				
				System.out.println("이름을 입력하세요: ");
				temp.id = scan.next();
				
				System.out.println("금액을 입력하세요: ");
				temp.money = scan.nextInt();
				userList[usrCnt] = temp;
				usrCnt++;
			}
			
			else if(sel == 2) {
				System.out.println("인덱스를 입력하세요: ");
				int index = scan.nextInt();
				
				for (int i = index; i < usrCnt; i++) {
					userList[i] = userList[i+1];
					
				}
				usrCnt--;
				
			}
			
			else if(sel == 3) {
				
				for (int i = 0; i < usrCnt; i++) {
					System.out.println(userList[i].id + userList[i].money);
					
				}
			}
			
			else if(sel == 4) {
				break;
			}
			
			
			
		}
		scan.close();

	}

}
