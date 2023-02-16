package com.test.ch15;

import java.util.Scanner;

public class Ex01WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 7을 입력하세요: ");
		String str = s.nextLine();
		String str2 = str + 10;
		System.out.println(str2);
		
		int i = Integer.parseInt(str);
		int i2 = i+10;
		System.out.println(i2);
		System.out.println();
		
		Integer intg1 = Integer.valueOf(i);
		System.out.println(intg1.intValue());
		System.out.println(intg1.compareTo(Integer.valueOf(5)));
		System.out.println(intg1.compareTo(Integer.valueOf(20)));
		System.out.println(intg1.compareTo(Integer.valueOf(7)));
		System.out.println();
		
		Integer intg2 = Integer.valueOf(22);
		System.out.println(intg1.intValue());
		System.out.println(intg1.hashCode());
		System.out.println(System.identityHashCode(intg1));
		System.out.println(intg2.intValue());
		System.out.println(intg2.hashCode());
		System.out.println(System.identityHashCode(intg2));
		System.out.println();
		
		System.out.println(intg1.equals(intg2));
		System.out.println(intg1.equals(Integer.valueOf(7)));
		System.out.println();
		
		System.out.println(Integer.max(intg1, intg2));
		System.out.println(Integer.min(intg1, intg2));
		System.out.println(Integer.sum(intg1, intg2));
		System.out.println();
		
		System.out.println(intg2.intValue() + 777);
		System.out.println(intg2.toString() + 777);
		System.out.println();
		
		String str3 = "3.14";
		System.out.println(str3 + 0.01);
		System.out.println(Double.parseDouble(str3) + 0.01);
		Double objpi = Double.valueOf(3.14);
		double pi = objpi.doubleValue();
		System.out.println(pi);
		System.out.println();
		
		
		
		

	}

}

/*
문제 1.
int a = 3;
int b = 7;
Integer intgA;
Integer intgB;
a와 b의 값을 갖는 intgA, intgB를 코딩하세요.
문제 2.
intgA와 intgB의 값을 더한 뒤 int로 변환하여 출력하세요.
문제 3.
intgA와 intgB의 값을 compareTo를 이용하여 비교하고 더 큰 값을 출력하세요.
문제 4.
intgA 와 intgB의 최소값과 최대값을 구하세요.
힌트) max, min을 사용하세요.
*/
