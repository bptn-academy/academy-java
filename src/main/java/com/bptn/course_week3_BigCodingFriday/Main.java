package com.bptn.course_week3_BigCodingFriday;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Store store = new Store();
		    try {
		        store.purchase("apple",10);
		        System.out.println("Purchase successful!");
		    } catch (OutOfStockException e) {
		        System.out.println(e.getMessage());
		    }

	}

}
