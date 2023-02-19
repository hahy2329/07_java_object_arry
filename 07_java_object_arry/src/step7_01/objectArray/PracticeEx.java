package step7_01.objectArray;

class ScoreList{
	
	int[] arr;
	int elementCnt;
	
	
	void add(int value) {
		if(elementCnt == 0) {
			arr = new int[elementCnt + 1];
		}
		else if(elementCnt >0) {
			int[] temp = arr;
			arr = new int[elementCnt+1];
			
			
			
			for (int i = 0; i < elementCnt; i++) {
				arr[i] = temp[i];
				
			}
			temp = null;
			
			
			
		}
		
		arr[elementCnt] = value;
		elementCnt++;
		
	}
	
	void add(int index, int value) {
		
		if(elementCnt == 0 ) {
			arr = new int[elementCnt+1];
		}
		
		else if(elementCnt > 0) {
			int[] temp = arr;
			arr = new int[elementCnt+1];
			
			for (int i = 0; i < elementCnt; i++) {
				arr[i] = temp[i];
				
			}// 첫 쨰, 우선 arr에 temp에 있는 값을 모두 넣어준다.
			
			for (int i = index; i < elementCnt; i++) {
				arr[i+1] = temp[i];
			}
			temp = null;
			
			arr[index] = value;
			elementCnt++;
			
			
		}
		
	}
	
	void remove(int index) {
		if(elementCnt == 1) {
			arr = null;
		}
		
		if(elementCnt > 1) {
			int[] temp = arr;
			arr = new int[elementCnt -1];
			
			int j = 0;
			for (int i = 0; i < elementCnt; i++) {
				if(i != index) {
					arr[j++] = temp[i];
				}
			}
			temp = null;
			
		
			
			
		}
		elementCnt--;
		
	}
	
	void print() {
		System.out.print("[");
		for (int i = 0; i < elementCnt; i++) {
			System.out.print(arr[i]);
			if(i != elementCnt-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
	}
	
	int size() {
		return elementCnt;
	}
	
	int get(int index) {
		return arr[index];
	}
	
	void set(int index, int value){
		arr[index] = value;
	}
	
	void clear() {
		arr = null;
		elementCnt = 0;
	}
}




public class PracticeEx {

	public static void main(String[] args) {
		
		ScoreList scoreList = new ScoreList();
		
		scoreList.add(10);
		scoreList.add(20);
		scoreList.add(30);
		scoreList.add(40);
		scoreList.add(50);
		scoreList.print();
		
		scoreList.add(3,9);
		
		scoreList.print();
		
		
		scoreList.remove(3);
		scoreList.print();
		
		
		int elementCount = scoreList.size();
		System.out.println(elementCount);
		
		System.out.print("[");
		for (int i = 0; i < elementCount; i++) {
			System.out.print(scoreList.get(i));
			if(i != elementCount-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		
		
		scoreList.set(3,5);
		scoreList.print();
		
		scoreList.clear();
		System.out.println(scoreList.size());
		

	}

}
