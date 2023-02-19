package step7_01.objectArray;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 
 * [java.util.ArrayList]
 * 
 * - 배열은 한번 선언하면 프로그램에서 배열의 크기를 바꿀 수 없다.
 * - ArrayList 클래스는 데이터가 입력되면 자동으로 크기가 커지고, 데이터가 삭제되면 자동으로 크기가 작아진다.
 * - 중간에 데이터가 삽입되면 데이터가 삽입 될 위치부터 모든 데이터가 뒤로 이동되고 중간의 데이터가 제거된 다음 위치부터 모든 데이터가 앞으로 이동한다.
 * 
 * 
 * [ ArrayList 생성 방법]
 * 
 * ArrayList<Integer> list = new ArrayList<Integer>();
 * ArrayList<Integer> list = new ArrayList<>(); //우변의 제네릭의 데이터형은 생략 가능하다.
 * ArrayList<String> list = new ArrayList<String>();
 * ArrayList<Product> list = new ArrayList<Product>();
 * ArrayList<Member> list = new ArrayList<Member>();
 * 
 * 
 * *[ 래퍼 클래스(wrapper class) ]
 * - 래퍼 클래스란, 기본 자료형을 클래스로 만들어 놓은 것을 의미한다.
 * [기본형]			[래퍼 클래스]
 * 	byte				Byte
 * 	short				Short
 * 	int					Integer
 * 	long				Long
 * 	float 				Float
 * 	double				Double
 * 	char 				Character
 * 	boolean				Boolean
 * 
 * 
 * [제네릭]
 * 
 * - 제네릭(generic)이라 부르며 ArrayList에 저장될 데이터 타입을 반드시 클래스로 작성한다.
 * - 기본 자료형 데이터를 저장하는 ArrayList를 만들어야 하는 경우에는 래퍼 클래스를 사용한다.
 * 
 * 
 * 
 * 
 * */

public class ObjectArrayEx10_풀이 {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("\n=====================\n");
		
		
		
		//add(value) : arrayList의 맨 뒤에 value를 추가한다.
		//add(index,value) : arrayList의 index번째에 value를 추가한다.
		
		//기존 배열 요소 추가 방식 
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		
		//ArrayList 추가 방식
		// ##ArrayList는 무조건 전부!! 메서드 방식으로 진행한다.(추가, 삭제 등등)
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(2, 30);
		list.add(50);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("\n=====================\n");
		
		
		// size() : ArrayList의 데이터의 개수를 반환한다.
		
		System.out.println("크기 :"+arr.length );
		System.out.println("크기 :" + list.size());
		
		//set(index,value) :ArrayList의 index번째의 값을 value값으로 수정한다.
		
		//배열 수정 방식
		arr[0] = 1000;
		arr[1] = 2000;
		arr[2] = 3000;
		
		
		//ArrayList의 수정 방식
		
		list.set(0, 1000);
		list.set(1, 2000);
		list.set(2, 3000);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("\n=====================\n");
		
		//get(index) : ArrayList의 index번째의 value값을 가져온다.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		
		// remove(index) : ArrayList의 index번째 위치의 값을 삭제한다.
		
		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 0;
		
		list.remove(2);
		list.remove(1);
		list.remove(0);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("\n=====================\n");
		
		
		/*
		 * 
		 * # 향상된 for문 (foreach)
		 * 
		 * [ 구조 ]
		 * 
		 * for(자료형 변수명 : Array or ArrayList){
		 * 		명령어;
		 * }
		 * 
		 * element가 직접 변수에 저장된다.
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		
		for (int 임시변수: arr) {
			System.out.print(임시변수);
		}
		System.out.println();
		
		
		
		//Integer 
		
		
		
		for(int 임시변수 : list) {
			System.out.println(임시변수);
		}
		System.out.println();
		
		
		//예시 1 )
		String[] index = {"한놈","두식이","석삼","너구리","오징어"};
		
		for(String element: index) {
			System.out.println(element);
		}
		System.out.println();
		
		
		
		//예시 2)
		ArrayList<Product> productList = new ArrayList<Product>();
		
		for (int i = 1; i < 11; i++) {
			Product temp = new Product();
			temp.name = "상품"+i;
			temp.price = 10000 * i;
			
			productList.add(temp);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(productList.get(i));
			System.out.println(productList.get(i).name);
			System.out.println(productList.get(i).price);
			System.out.println();
		}
		System.out.println("\n====================\n");
		
		for(Product product : productList) {
			System.out.println(product);
			System.out.println(product.name);
			System.out.println(product.price);
			System.out.println();
		}
		
		arr = null; // 배열 자체를 사라지게함 
		System.out.println(arr);
		list.clear(); // ArrayList의 모든 데이터만!! 삭제(휴지통 안에 쓰레기를 비우는 느낌) 껍데기만 남아있다.
		list.add(10); //껍데기는 살아 있으므로 안에다 데이터 추가 가능
		list = null; // ArrayList 자체를 사라지게 함.
		
		list.add(10); //문법상 오류는 안떠있지만 실행했을때 nullpoint에러발생 즉, ArrayList자체가 날아갔기 때문.
		
		
		
		
		
		
		
		
		
	}

}
