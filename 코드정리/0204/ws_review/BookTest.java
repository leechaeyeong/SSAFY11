package com.ssafy.workshop;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("21424", "Java Pro", "김하나", "Jaen.kr", 15000, "Java 기본 문법");
		Book book2 = new Book("35355", "분석설계", "소나무", "Jaen.kr", 30000, "SW  모델링");
		Book [] books = {book, book2};
		
		Magazine magazine = new Magazine("35535", "Java World", "편집부", "Java.com", 7000, "첫걸음", 2018, 2);
		Magazine [] magazines = {magazine};
		
		System.out.println("*********************** 도서목록 **************************");
		for(Book temp: books) {
			System.out.println(temp.toString());
		}
		System.out.println("*********************** 잡지목록 **************************");
		for(Magazine temp: magazines) {
			System.out.println(temp.toString());
		}
	}

}
