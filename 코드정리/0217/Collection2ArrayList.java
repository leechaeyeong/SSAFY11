import java.util.ArrayList;

/*
 * ArrayList : array -> ArrayList -> LinkedList(array와 LinkedList 사이 개념.)
 * ArrayList는 LinkedList 보다, data 추가 삭제 시의 부하가 큼.
 * array는 동적을 길이가 변하지 않음.
 * size() : 길이 개념.
 * index 개념.
 */
public class Collection2ArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Double(3.14));
		list.add(new String("hello"));//add
		Object o = list.get(0);//get
		if(o instanceof Double) {
			Double d = (Double) o;
		}
		ArrayList<Double> list2 = new ArrayList<Double>();
		list2.add(new Double(3.14));
		//list2.add(new String("hello"));//error - list2는 Double 전용으로 data type 제한
		Double d2 = list2.get(0);//data type 제한으로 casting 필요 없음.
		//====================================
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));//get - index 접근.
//		}
//		for(Object o2 : list) {
//			System.out.println(o2);
//		}
		System.out.println(list.contains(3.14));//contains
		ArrayList list3 = (ArrayList) list.clone();//clone
		list3.add("bye~~~");
		list3.add("bye~~~");
		list3.add("first");
		list3.add("second");
		list3.add(33333);
		System.out.println("list3 : "+list3);
		System.out.println(list3.indexOf("bye~~~"));//indexOf
		System.out.println(list3.lastIndexOf("bye~~~"));//lastIndexOf
		list3.remove(0);//remove : 특정 위치 data 삭제.
		list3.remove("bye~~~");//remove : 특정 객체 삭제.
		System.out.println("list3 : "+list3);
		Object[] oArr = list3.toArray();
//		for(Object o2 : list) {
//			System.out.println(o2);
//		}
		System.out.println("list3.isEmpty() : "+list3.isEmpty());
		list3.clear();
		System.out.println("list3.isEmpty() : "+list3.isEmpty());
		System.out.println(list3);
		System.out.println(list);
	}//main

}







