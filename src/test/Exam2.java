package test;

import java.util.ArrayList;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {3,5,6};
		for(int i =0 ;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("FOR EACH");
		for(int k : a) {
			System.out.println(k);
		}
		
		
		ArrayList aa= new ArrayList();
		aa.add(20);
		aa.add(34);
		aa.add(44);
		for(Object kk : aa) {
			System.out.println(kk);
		}
	}

}
