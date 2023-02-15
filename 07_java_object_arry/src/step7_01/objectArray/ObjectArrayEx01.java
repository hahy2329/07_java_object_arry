package step7_01.objectArray;

class Product{
	String name; // 이름
	int price; // 가격
}




public class ObjectArrayEx01 {

	public static void main(String[] args) {
		
		
		//int[] arr = new int[3];
		//arr[0] = 10;
		//arr[1] = 20;
		//arr[2] = 30;
		
		//클래스명[] 변수명 = new 클래스명[크기];
		Product[] productList = new Product[3]; //객체를 배열로 만든 기법
		
		
		//배열에 값 대입 방법 1
		Product product = new Product();
		product.name = "기계식키보드";
		product.price = 45000;
		
		
		
		productList[0] = product; 
		
		//배열에 값 대입 방법 2
		productList[1] = new Product(); 
		productList[2] = new Product(); 
				
		
		
		productList[1].name = "무소음 마우스";
		productList[1].price = 27000;
		
		productList[2].name = "장패드";
		productList[2].price = 10000;
		
		for (int i = 0; i < productList.length; i++) {
			System.out.println("name :"+ productList[i].name);
			System.out.println("price :" + productList[i].price);
			System.out.println();
		}
		
		//[응용] 생각해보기
		
		// ? temp1 = productList; //주소 or 데이터
		// ? temp2 = productList[0]; //주소 or 데이터
		// ? temp3 = productList[0].name; //주소 or 데이터
		// ? temp4 = productList[0].price; //주소 or 데이터
		
		
		
		//1
		Product[] temp1 = productList; // 주소
		//2
		Product temp2 = productList[0]; // 주소
		//3
		String temp3 = productList[0].name; // 데이터
		//4 
		int temp4 = productList[0].price; //데이터
		
		
		Product temp = productList[2];
		System.out.println("temp : " + temp); // productList[2]의 주소 출력
		System.out.println("productList[2] : " + productList[2]); // productList[2]의 주소 출력
		
		System.out.println("temp.name : " + temp.name); //productList[2]가 가지는 name이 출력
		System.out.println("productList[2].name : " + productList[2].name); // productList[2]의 name출력
		
		temp.name = "장패드1";
		System.out.println("temp.name : " + temp.name); // 새로 값을 대입한 '장패드1'이 출력
		System.out.println("productList[2].name : " + productList[2].name); // 위와 같음
		//주소를 공유하게 되면 둘 중 하나가 다른 값을 저장하게 되면 다른 하나도 같이 이동(한 몸이라 생각할 것)
		
		productList[2].name = "장패드2"; 
		System.out.println("temp.name : " + temp.name); // 새로 값을 대입한 '장패드2'가 출력
		System.out.println("productList[2].name : " + productList[2].name); // 위와 같음 
		
		
		
	}

}
