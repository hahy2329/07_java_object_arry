package step7_01.objectArray;

import java.util.HashMap;

class TempMember {
	
	String id;
	String passwd;
	String name;
	String email;
	String address;
	
}



/*
  
  	 # HashMap
  	 
 	- HashMap은 K(Key)에 V(Value)를 할당 방식으로 데이터가 저장하는 데이터 형식이다.
	- HashMap은 순서와 상관없이 key로 데이터를 저장 및 관리한다.
	- HashMap 생성방법
	
		HashMap<키, 값> 변수명 = new HashMap<키, 값>();
		HashMap<키, 값> 변수명 = new HashMap<>();						// new 뒤쪽의 generic은 생략 가능하다.
		
		Ex)
		 HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		 HashMap<String, Integer> hmap = new HashMap<>();				 
		 
		 설명)
		 HashMap<String,Integer> : key의 데이터타입은 String이고 저장될 값의 데이터 타입은 Integer이다.
		 HashMap<String,String>  : key의 데이터타입은 String이고 저장될 값의 데이터 타입은 String이다.
		 HashMap<String,Object>  : key의 데이터타입은 String이고 저장될 값의 데이터 타입은 Object이다.
		 HashMap<String,Product> : key의 데이터타입은 String이고 저장될 값의 데이터 타입은 Product이다.
		 HashMap<String,Member>  : key의 데이터타입은 String이고 저장될 값의 데이터 타입은 Member이다.


*/


public class ObjectArrayEx15 {

	public static void main(String[] args) {


		
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		
		
		
		
		// put(key, value) : HashMap의 key에 value를 할당한다. 
		// put()메서드는 존재하지 않는 key에 넣어주면 데이터가 입력되고 존재하는 key에 넣어주면 수정된다. 
		
		hMap.put("data1", 1000);
		hMap.put("data2", 2000);
		hMap.put("data3", 3000);
		System.out.println(hMap);//순서랑 전혀 관계없음 키값으로 찾기 때문.
		System.out.println("\n==================\n");
		
		hMap.put("data1", 10000); //데이터 수정
		hMap.put("data2", 20000); //데이터 수정
		hMap.put("data3", 30000); //데이터 수정
		
		
		hMap.put("data4", 4000); // 데이터 추가
		hMap.put("data5", 5000); // 데이터 추가
		
		System.out.println(hMap);
		System.out.println("\n=================\n");
		
		// size() : HashMap의 데이터개수를 반환한다.
		System.out.println("크기: " + hMap.size());
		System.out.println("\n=================\n");
		
		
		
		// get(key) : HashMap의 key에 할당된 value를 얻어온다.
		System.out.println(hMap.get("data1"));
		System.out.println(hMap.get("data2"));
		System.out.println(hMap.get("data3"));
		System.out.println(hMap.get("data4"));
		System.out.println(hMap.get("data5"));
		System.out.println("\n=================\n");
		
		
		
		
		// keySet() : HashMap의 key만 얻어온다.
		
		System.out.println(hMap.keySet());
		
		
		for (String key : hMap.keySet()) {
			System.out.println(hMap.get(key));
			
		}
		
		
		// remove(key) : HashMap의 key에 해당하는 값을 제거한다.

		hMap.remove("data1");
		hMap.remove("data2");
		hMap.remove("data3");
		System.out.println(hMap);
		System.out.println("\n==================\n");
		hMap.clear(); //HashMap의 모든 데이터만! 삭제 (휴지통 비우기) 
	
		hMap = null;// HashMap 자체를 삭제 
		
		
		
		// 웹에서 자주 사용하는 예시 1
				TempMember temp = new TempMember();
				temp.id = "user1";
				temp.name = "유저1";
				temp.passwd = "1";
				temp.email ="1@gmail.com";
				temp.address = "서울";
				
				//클래스 내에서만 선언한 메서드만 이용 가능 (규칙!!엄격) 
				
				
				
				HashMap<String, Object> tempMap = new HashMap<String, Object>();
				tempMap.put("id", "user1");
				tempMap.put("name", "유저1");
				tempMap.put("passwd", "1");
				tempMap.put("email", "1@gmail.com");
				tempMap.put("address", "서울");
				
				//클래스의 필드 외에 추가적인 데이터 저장이 가능 
				tempMap.put("isMobile", true);
				tempMap.put("browserCd", 1);
				tempMap.put("isMember", false);
				
				
				
				
				
				
				//웹에서 자주 사용하는 예시 2 
				
				HashMap<String, TempMember> tempMemberMap = new HashMap<String, TempMember>();
				
				// 실습데이터 생성
				for (int i = 100; i < 110; i++) {
					
					TempMember tempMember = new TempMember();
					tempMember.id = "user" + i;
					tempMember.passwd = "0000";
					tempMember.name = "익명";
					tempMember.email = "user" + i + "@naver.com";
					tempMember.address = "서울";
					
					
					tempMemberMap.put(tempMember.id, tempMember); //각자 객체를 해쉬 맵에 넣어 줌.
				}
				
				// 참고) Object 타입을 명시할경우 서로 다른데이터를 저장할 수 있다.
				HashMap<String, Object > testMap = new HashMap<String, Object >();
				testMap.put("키1","문자열" );
				testMap.put("키2", 100 );
				testMap.put("키3", true );
				testMap.put("키4",3.14 );
				testMap.put("키5", 'p' );
				testMap.put("키6",new TempMember() );
				testMap.put("키7", new Product() );
				
				
				
				
				
				
	}

}
