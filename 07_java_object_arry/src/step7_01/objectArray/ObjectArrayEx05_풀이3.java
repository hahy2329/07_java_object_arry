package step7_01.objectArray;

class Client_풀이3{
	
	
	
	String id;
	String passwd;
	String name;
	String birth;
	int age;
	String contact;
	String address;
	
	void printClient(String id, String passwd, String name, String birth, int age, String contact, String address) {
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.birth = birth;
		this.age =age;
		this.contact =contact;
		this.address = address;
	}
	
	void showClient() {
		System.out.println(this.id);
		System.out.println(this.passwd);
		System.out.println(this.name);
		System.out.println(this.birth);
		System.out.println(this.age);
		System.out.println(this.contact);
		System.out.println(this.address);
		
	}
	
	
	

}
public class ObjectArrayEx05_풀이3 {

	public static void main(String[] args) {
		
		Client_풀이3[] clientList = new Client_풀이3[3];
		
		for (int i = 0; i < clientList.length; i++) {
			clientList[i] = new Client_풀이3();
		}
		
		clientList[0].printClient("hah", "1111", "홍길동", "1995-01-01",29, "000-0000-0000", "서울");
		clientList[1].printClient("Sah", "2121", "김길동", "1995-02-02",29, "111-0000-0000", "서울");
		clientList[2].printClient("FGah", "2221", "신길동", "1995-03-03",29, "000-0000-3333", "경기");
		
		for (int i = 0; i < clientList.length; i++) {
			clientList[i].showClient();
			System.out.println("===================");
		}
		
		
	}

}
