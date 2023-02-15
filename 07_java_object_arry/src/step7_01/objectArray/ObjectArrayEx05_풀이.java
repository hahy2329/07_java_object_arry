package step7_01.objectArray;

class Client_풀이{
	
	
	
	String id;
	String passwd;
	String name;
	String birth;
	int age;
	String contact;
	String address;
	
	void printClient(String id, String passwd, String name, String birth, int age, String contact, String address) {
		this.id = id; // this는 내 자신한테 넣겠다라고 생각하자.
		this.passwd = passwd;
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.contact = contact;
		this.address = address;
		
	}
	
	void showClient() {
		System.out.println("id: " + this.id);
		System.out.println("passwd: " + this.passwd);
		System.out.println("name: " + this.name);
		System.out.println("birth: " + this.birth);
		System.out.println("age: " + this.age);
		System.out.println("contact: " + this.contact);
		System.out.println("address: " + this.address);
	}
	

}
public class ObjectArrayEx05_풀이 {

	public static void main(String[] args) {
		
		Client_풀이[] client = new Client_풀이[3];
		
		for (int i = 0; i < client.length; i++) {
			client[i] = new Client_풀이();
			
		}
		
		client[0].printClient("aaa", "1111","홍길동" , "1995-05-01", 29, "010-1111-2222", "경기");
		client[1].printClient("bbb", "2222","이순신" , "1995-06-01", 29, "010-2222-2222", "서울");
		client[2].printClient("ccc", "333","김시민" , "1995-07-01", 29, "010-3333-2222", "충청도");
		
		for (int i = 0; i < client.length; i++) {
			client[i].showClient();
			System.out.println("=============================");
		}
		
		
	}

}
