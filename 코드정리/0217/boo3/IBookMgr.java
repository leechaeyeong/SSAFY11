package com.ssafy.boo3;

import java.util.ArrayList;


public interface IBookMgr {
	void add(Book book);
	
	//전체 데이터 검색
	ArrayList<Book> total();
	
	//Isbn으로 정보를 검색
	Book findByIsbn(String Isbn);
	
	//Title로 정보를 검색
	ArrayList<Book> findByTitle(String title);
	
	//Magazine만 검색
	ArrayList<Magazine> findMagazine();
	
	//Magazine중 올해 잡지만 검색
	ArrayList<Magazine> findMagazine_year(int year);
	
	//출판사로 검색
	ArrayList<Book> findByPublisher(String publisher);
	
	//Novel만 검색
	ArrayList<Novel> findNovel();
	
	//가격으로 검색
	ArrayList<Book> findByPrice(int price);
	
	//저장된 모든 금액 합계
	int sum();
	
	//저장된 모든 금액 평균
	double average();
}
