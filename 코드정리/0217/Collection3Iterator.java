import java.util.ArrayList;
import java.util.Iterator;

public class Collection3Iterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hi");
		list.add("hello");
		list.add("how are you");
		list.add("i am fine");
		list.add("thanks");
		System.out.println(list);
		Iterator<String> iter = list.iterator();
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
		while(iter.hasNext()) {//hasNext : 현재 커서 위치의 다음 라인에 data가 있는지 문의.
			System.out.println(iter.next());
			//next : 커서를 다음 라인으로 이동 시키고, 이동한 라인의 data 추출.
		}
	}//main

}


