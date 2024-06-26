package com.javex.practice;

public class Ex05 {

	public static void main(String[] args) {
		// 아래의 출력결과를 예상하여 작성하세요
		//1 to 5
		
		int i = 1;
		boolean flag = true;
		
		while (flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i++;
		}

	}

}
