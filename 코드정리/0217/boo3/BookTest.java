package com.ssafy.boo3;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Magazine("00000", "책이름1", "작가이름1", "출판사1", 20000, "Java1", 2019, 3);
		Book b2 = new Novel("11111", "책이름1", "작가이름2", "출판사2", 20000, "Java2", "로맨스");
		Book b3 = new Magazine("22222", "책이름3", "작가이름3", "출판사3", 30000, "Java3", 2011, 1);
		Book b4 = new Novel("33333", "책이름4", "작가이름4", "출판사4", 40000, "Java4", "스릴러");
		Book b5 = new Magazine("44444", "책이름5", "작가이름5", "출판사5", 50000, "Java5", 2015, 11);
		
		BookMgrImpl bm = new BookMgrImpl();
		bm.add(b1);
		bm.add(b2);
		bm.add(b3);
		bm.add(b4);
		bm.add(b5);
		
		System.out.println(bm.total());
		System.out.println("-------------------");
		System.out.println(bm.findByIsbn("11111"));
		System.out.println("-------------------");
		System.out.println(bm.findByTitle("책이름1"));
		System.out.println("-------------------");
		System.out.println(bm.findMagazine());
		System.out.println("-------------------");
		System.out.println(bm.findMagazine_year(2011));
		System.out.println("-------------------");
		System.out.println(bm.findByPublisher("출판사4"));
		System.out.println("-------------------");
		System.out.println(bm.findNovel());
		System.out.println("-------------------");
		System.out.println(bm.findByPrice(20000));
		System.out.println("-------------------");
		System.out.println("금액 합계 : " + bm.sum());
		System.out.println("-------------------");
		System.out.println("금액 평균 : " + bm.average());
		
		
		
	}

}
