package step7_01.objectArray;

class Account_풀이{
	
	String id;
	int money;
}

public class ObjectArrayEx03_풀이 {

	public static void main(String[] args) {
		
		
		
		Account_풀이[] accountList = new Account_풀이[2];
		
		for (int i = 0; i < accountList.length; i++) {
			accountList[i] = new Account_풀이();
		}
		
		accountList[0].id = "qwer1234";
		accountList[0].money = 1000;
		
		accountList[1].id = "asdf1234";
		accountList[1].money = 2000;
		
		for (int i = 0; i < accountList.length; i++) {
			System.out.println(accountList[i].id + " " + accountList[i].money);
			
		}
		Account_풀이 temp = accountList[1];
		temp.id = "zxcv1234";
		System.out.println("=====================");
		
		
		for (int i = 0; i < accountList.length; i++) {
			System.out.println(accountList[i].id + " " + accountList[i].money);
		}
		
	}

}
