package step7_01.objectArray;

class Account_풀이3{
	
	String id;
	int money;
}

public class ObjectArrayEx03_풀이3 {

	public static void main(String[] args) {
		
		Account_풀이3[] accountList = new Account_풀이3[2];
		
		for (int i = 0; i < accountList.length; i++) {
			accountList[i] = new Account_풀이3();
			
		}
		
		accountList[0].id = "qwer1234";
		accountList[0].money = 1000;
		
		accountList[1].id = "asdf1234";
		accountList[1].money = 2000;
		
		
		for (int i = 0; i < accountList.length; i++) {
			System.out.println(accountList[i].id + " " + accountList[i].money);
			
		}
		
		Account_풀이3 temp = accountList[1];
		temp.id = "홍길동";
		
		for (int i = 0; i < accountList.length; i++) {
			System.out.println(accountList[i].id + " " + accountList[i].money);
			
		}
		
	
		
	}

}
