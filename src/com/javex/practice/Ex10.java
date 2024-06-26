package com.javex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		//정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
		int sum = 0 ;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("숫자를 입력 하세요");
		for(int i= 0 ; i < 5 ; i++) {
			System.out.print("숫자:	");
			int numb = sc.nextInt();
			if (numb > sum) {
				sum = numb;
			}
		}
		
		System.out.println("최대 값은 " + sum +"입니다");
		sc.close();
	}

}
