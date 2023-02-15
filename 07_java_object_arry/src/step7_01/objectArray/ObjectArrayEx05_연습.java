package step7_01.objectArray;

class Client{
	
	
	
	String id;
	String passwd;
	String name;
	String birth;
	int age;
	String contact;
	String address;
	
	void setData(String id, String passwd, String name, String birth, int age, String contact, String address) { //파라메타로 전달된 데이터를 필드에 대입
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.contact = contact;
		this.address = address;
	}
	
	void printData() {
		System.out.println(this.id);
		System.out.println(this.passwd);
		System.out.println(this.name);
		System.out.println(this.birth);
		System.out.println(this.age);
		System.out.println(this.contact);
		System.out.println(this.address);
	}
}


public class ObjectArrayEx05_연습 {

	public static void main(String[] args) {
		
		Client[] clientList = new Client[3];
		for (int i = 0; i < clientList.length; i++) {
			clientList[i] = new Client();
			
			
		}
		clientList[0].id = "qwwer11";
		clientList[0].passwd = "1111";
		clientList[0].name = "사용자1";
		clientList[0].birth = "2023-01-01";
		clientList[0].age = 1;
		clientList[0].contact = "010-1111-2222";
		clientList[0].address = "서울";
		
		
		//메서드를 만들어 놓고 하면 데이터를 직접 넣고 실행하는게 참 편리해진다.
		clientList[1].setData("user1","2222","사용자2","2022-01-01",2,"010-2222-1112","경기");
		clientList[2].setData("user2","3222","사용자3","2022-01-02",3,"010-2222-1113","경기");
		
		for (int i = 0; i < clientList.length; i++) {
			clientList[i].printData();
			System.out.println();
			
		}
		
		
	}

}
