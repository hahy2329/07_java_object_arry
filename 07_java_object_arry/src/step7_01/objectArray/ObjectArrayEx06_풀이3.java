package step7_01.objectArray;

class Member_풀이3{
	
	String name;
	int num;
	
	
}


class MemberManager_풀이3{

	Member_풀이3[] memberList = new Member_풀이3[3];
	
	
	

	
	
}


public class ObjectArrayEx06_풀이3 {

	public static void main(String[] args) {
	
		MemberManager_풀이3 memberListed = new MemberManager_풀이3();
		
		Member_풀이3 m1 = new Member_풀이3();
		
		memberListed.memberList[0] = m1;
		m1.name = "홍길동";
		m1.num = 95;
		
		
		m1 = new Member_풀이3();
		memberListed.memberList[1] = m1;
		m1.name = "김길동";
		m1.num = 88;
		
		m1 = new Member_풀이3();
		memberListed.memberList[2] = m1;
		m1.name = "신길동";
		m1.num = 87;
		
		for (int i = 0; i < memberListed.memberList.length; i++) {
			System.out.println(memberListed.memberList[i].name+ ": "
					+memberListed.memberList[i].num);
			System.out.println("-============-");
		}
		
		
		Member_풀이3 temp = memberListed.memberList[1];
		System.out.println("num : " + temp.num);
		System.out.println("name : " +temp.name);
		
		

	}

}
