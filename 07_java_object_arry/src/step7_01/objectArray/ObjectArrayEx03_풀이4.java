package step7_01.objectArray;

class Account_풀이4 {
	 
	String id; 
	int money;
	
}

public class ObjectArrayEx03_풀이4 {

	public static void main(String[] args) {
		
	Account_풀이4[] accountList = new Account_풀이4[2];
	
	for (int i = 0; i < accountList.length; i++) {
		accountList[i] = new Account_풀이4();
		
	}
	accountList[0].id = "qwer1234";
	accountList[0].money = 20000;
	
	accountList[1].id = "sdfe3456";
	accountList[1].money = 30000;
	
	
	Account_풀이4 temp = accountList[1];
	temp.id = "qqwer2222";
	
	for (int i = 0; i < accountList.length; i++) {
		System.out.println(accountList[i].id + " " + accountList[i].money);
		System.out.println();
	}
	
	}

}
