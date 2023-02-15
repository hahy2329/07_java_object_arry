package step7_01.objectArray;

class Card_풀이4 {
	
	int num;
	String shape;
	
}

public class ObjectArrayEx02_풀이4 {

	public static void main(String[] args) {
		
		 Card_풀이4[] card = new Card_풀이4[100];
		 
		 for (int i = 0; i < card.length; i++) {
			card[i] = new Card_풀이4();
			card[i].num = (i+1);
			card[i].shape = "클로버";
		}
		 
		 for (int i = 0; i < card.length; i++) {
			System.out.println(card[i].num + " " + card[i].shape);
			System.out.println();
		}
		 
	}

}
