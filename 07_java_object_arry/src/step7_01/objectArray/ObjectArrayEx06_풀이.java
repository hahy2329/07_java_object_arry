package step7_01.objectArray;

class Member_풀이{
	
	String name;
	int num;
	
	
}


class MemberManager_풀이{

	Member_풀이[] memberList = new Member_풀이[3];

}


public class ObjectArrayEx06_풀이 {

	public static void main(String[] args) {
		//첫 째, 배열의 클래스를 먼저 객체로 생성한다.
		MemberManager_풀이 memberManagerList = new MemberManager_풀이();
		 
		
		
		//둘 째, 배열에 넣을 클래스 설계도를 생성하여 배열객체 = 일반 클래스 주소를 같이 바라보게 한 다음, 객체의 멤버변수에 대입.
		Member_풀이 hong = new Member_풀이();
		memberManagerList.memberList[0] = hong;
		hong.name = "홍길동";
		hong.num = 95;
		
		
		Member_풀이 kim = new Member_풀이();
		memberManagerList.memberList[1] = kim;
		kim.name = "김시민";
		kim.num = 95;
		
		Member_풀이 lee = new Member_풀이();
		memberManagerList.memberList[2] = lee;
		lee.name = "이순신";
		lee.num = 95;
		
		for (int i = 0; i < memberManagerList.memberList.length; i++) {
			System.out.println(memberManagerList.memberList[i].name + " " + memberManagerList.memberList[i].num);
			System.out.println("==================");
		}
		

	}

}
