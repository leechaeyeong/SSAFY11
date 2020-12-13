package com.ssafy.boo3;

import java.util.ArrayList;


public class BookMgrImpl implements IBookMgr {
private ArrayList<Book> list;

	public BookMgrImpl() {
		list = new ArrayList<>();
	}
	
	@Override
	public void add(Book book) {
		list.add(book);
	}

	@Override
	public ArrayList<Book> total() {
		return list;
	}

	@Override
	public Book findByIsbn(String Isbn) {
		Book b = null;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getIsbn() == Isbn) {
				b = list.get(i);
				break;
			}
		}
		return b;
	}

	@Override
	public ArrayList<Book> findByTitle(String title) {
		ArrayList<Book> al = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle() == title) {
				al.add(list.get(i));
			}
				
		}
		return al;
	}

	@Override
	public ArrayList<Magazine> findMagazine() {
		ArrayList<Magazine> al = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) instanceof Magazine) {
				al.add((Magazine) list.get(i));
			}
		}
		return al;
	}

	@Override
	public ArrayList<Magazine> findMagazine_year(int year) {
		ArrayList<Magazine> list2 = findMagazine();
		ArrayList<Magazine> al = new ArrayList<>();
		
		for(int i=0; i<list2.size(); i++) {
			if(list2.get(i).getYear() == year) {
				al.add(list2.get(i));
			}
		}
		return al;
	}

	@Override
	public ArrayList<Book> findByPublisher(String publisher) {
		ArrayList<Book> al = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getPublisher() == publisher) {
				al.add(list.get(i));
			}
		}
		return al;
	}

	@Override
	public ArrayList<Novel> findNovel() {
		ArrayList<Novel> al = new ArrayList<>();

		for(int i=0; i<list.size(); i++) {
			if(list.get(i) instanceof Novel) {
				al.add((Novel) list.get(i));
			}
		}
		return al;
	}

	@Override
	public ArrayList<Book> findByPrice(int price) {
		ArrayList<Book> al = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getPrice() == price) {
				al.add(list.get(i));
			}
		}
		return al;
	}

	@Override
	public int sum() {
		int sum = 0;
		for(int i=0; i<list.size(); i++) {
			sum += list.get(i).getPrice();
		}
		return sum;
	}

	@Override
	public double average() {
		double avr = sum()/list.size();
		return avr;
	}
	
}
