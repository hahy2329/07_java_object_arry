package step7_01.objectArray;

import java.util.Scanner;

class User2{
	String id;
	int money;
}

public class ObjectArrayEx04_풀이3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		User2[] userList = new User2[100];
		for (int i = 0; i < userList.length; i++) {
			userList[i] = new User2();
			
		}
		
		int usrCnt =0;
		
		while(true) {
			System.out.println("1.회원가입");
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			System.out.println("4.종료");
			int menu = scan.nextInt();
			
			
			if(menu == 1) {
				User2 temp = new User2();
				
				System.out.println("이름을 입력하세요: ");
				temp.id = scan.next();
				
				System.out.println("금액을 입력하세요: ");
				temp.money = scan.nextInt();
				
				userList[usrCnt] = temp;
				usrCnt++;
			}
			
			else if(menu == 2) {
				System.out.println("인덱스를 입력하세요: ");
				int index = scan.nextInt();
				
				for (int i = index; i < usrCnt; i++) {
					userList[i] = userList[i+1];
					
				}
				usrCnt--;
				
			}
			
			else if(menu == 3) {
				for (int i = 0; i < usrCnt; i++) {
					System.out.println(userList[i].id + " " + userList[i].money);
					
				}
			}
			
			else if(menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	

	}

}
