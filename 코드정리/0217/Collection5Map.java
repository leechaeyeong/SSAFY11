import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * map : key를 호출하면, value를 주는 저장 구조.
 */
public class Collection5Map {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"hi");
		map.put(2,"hello");
		map.put(3,"how are you");
		map.put(4,"i am fine");
		map.put(5,"thanks");//put
		System.out.println(map);//순서 없음.
		System.out.println("map.size : "+map.size());//순서 없음.
		/**/
		Set<Integer> set = (Set<Integer>) map.keySet();
		//System.out.println(set);
		//keySet : 키값만 Set<key data type> 객체로 가져온다
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int keyInt = it.next();
			System.out.println(keyInt+" : "+map.get(keyInt));
		}
		/**/
		//System.out.println(map.values());
		Collection<String> col = map.values();
		Iterator<String> it2 = col.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("map.containsKey : "+map.containsKey(5));
		System.out.println("map.containsValue : "+map.containsValue("thank you"));
		System.out.println("map.get : "+map.get(1));
		HashMap map2 = (HashMap) map.clone();
		map2.remove(1);
		map2.remove(2,"world");
		System.out.println(map2);
		System.out.println(map2.isEmpty());
		map2.clear();
		System.out.println(map2.isEmpty());
	}//main

}






