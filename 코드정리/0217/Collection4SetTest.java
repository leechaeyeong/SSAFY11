import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Collection4SetTest {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(list.size()<6) {
			int number = rand.nextInt(45)+1;//1에서45까지.
			if(!list.contains(number)) {
				list.add(number);
			}
		}
		System.out.println(list);
		//1. HashSet 이용
		//2. 중복되지않는 1~45의 수를 6개 뽑으세요.
		//3. Iterator 사용하여 출력하세요.
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size()<6) {
			int number = rand.nextInt(45)+1;//1에서45까지.
			set.add(number);
		}
		//System.out.println(set);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
	}//main

}
