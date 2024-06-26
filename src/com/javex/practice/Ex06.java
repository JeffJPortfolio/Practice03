package com.javex.practice;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = 0;
		while (ans < 100) {
			if (ans%5 == 0 && ans%7 ==0  && ans != 0) {
				System.out.println(ans);
			}
			ans +=5 ;
		}
	}

}
