package step7_01.objectArray;


class Mylist_풀이3{
	
	int[] arr;
	int elementCnt;
	
	void add(int value) {
		if(elementCnt ==0) {
			arr = new int[elementCnt+1];
			
		}
		
		else if(elementCnt>0) {
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
		if(elementCnt == 0) {
			arr = new int[elementCnt+1];
			
		}
		
		else if(elementCnt>0) {
			int[] temp = arr;
			arr = new int[elementCnt+1];
			int j = 0;
			for (int i = 0; i < elementCnt+1; i++) {
				if(i!=index) {
					arr[i] = temp[j++];
				}
			}
			temp = null;
			
			
			
		}
		
		arr[index] = value;
		elementCnt++;
		
		
	}
	
	void remove(int index) {
		if(elementCnt == 1) {
			arr = null;
		}
		
		else if(elementCnt>1) {
			int[] temp = arr;
			arr = new int[elementCnt-1];
			
			int j = 0;
			for (int i = 0; i < elementCnt; i++) {
				if(i!=index) {
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
			if(i!=elementCnt-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
	}
	
	int size() {
		
		return arr.length;
	}
	
	int get(int index) {
		return arr[index];
	}
	
	void set(int index, int value) {
		arr[index] = value;
	}
	
	void clear() {
		arr = null;
		elementCnt = 0;
	}
	
	
}


public class ObjectArrayEx13_풀이2 {

	public static void main(String[] args) {
		

		Mylist_풀이3 mylist = new Mylist_풀이3();
		
		mylist.add(10);
		mylist.add(20);
		mylist.add(30);
		mylist.add(40);
		mylist.add(50);
		mylist.print();
		
		//삽입하기
		mylist.add(0,9);
		
		//출력
		mylist.print();
		
		//(index)로 삭제하기
		mylist.remove(3);
		mylist.print();
		
		//길이 구하기
		int elementCount = mylist.size();
		System.out.println("elementCount : " + elementCount);
		
		
		//(index)값 꺼내오기
		
		System.out.print("[");
		for (int i = 0; i < elementCount; i++) {
			System.out.print(mylist.get(i));
			if(i != elementCount-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		//특정 위치의 값 수정하기 
		mylist.set(3,5);
		mylist.print();
		
		//모든 데이터를 제거하기
		mylist.clear();
		System.out.println(mylist.size());
		
		
		
	}

}
