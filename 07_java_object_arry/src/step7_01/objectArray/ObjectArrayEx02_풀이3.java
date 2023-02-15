package step7_01.objectArray;

class Card_풀이3 {
	
	int num;
	String shape;
	
}

public class ObjectArrayEx02_풀이3 {

	public static void main(String[] args) {
		Card_풀이3[] cardNum = new Card_풀이3[100];
		
		for (int i = 0; i < cardNum.length; i++) {
			cardNum[i] = new Card_풀이3();
			cardNum[i].num = (i+1);
			cardNum[i].shape = "클로버";
			
		}
		
		for (int i = 0; i < cardNum.length; i++) {
			System.out.println(cardNum[i].num + " " + cardNum[i].shape);
			System.out.println();
		}
		
		 
		 
	}
}
