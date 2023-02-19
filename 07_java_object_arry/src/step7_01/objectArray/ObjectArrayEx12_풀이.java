package step7_01.objectArray;

import java.util.ArrayList;






public class ObjectArrayEx12_풀이 {

	public static void main(String[] args) {
		ArrayList<Tv> a =  new ArrayList<Tv>();
		
		Tv temp = new Tv();
		temp.setData("TV", "삼성",220);
		a.add(temp);
		
		
		temp = new Tv();
		temp.setData("시그니처TV", "애플", 180);
		a.add(temp);
		
		temp = new Tv();
		temp.setData("스마트TV", "LG", 186);
		a.add(temp);
		
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println("객체 주소:"+ a.get(i));
			System.out.println("상품 이름: " + a.get(i).name);
			System.out.println("상품 브랜드: " + a.get(i).brand);
			System.out.println("상품 가격: " + a.get(i).price);
		}
		System.out.println();
		
		for (Tv tv : a) {
			System.out.println(tv.brand);
			System.out.println(tv.name);
			System.out.println(tv.price);
			System.out.println();
		}
	}

}
