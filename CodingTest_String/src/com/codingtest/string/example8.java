package com.codingtest.string;

import java.util.Scanner;

class example8 {	
	public String solution(String s){
		String answer="NO";
		s=s.toUpperCase().replaceAll("[^A-Z]", ""); //���ĺ� A���� Z������ �ƴϸ�(^)
		String tmp=new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) { //abcdbca �� �Ųٷ� ������ �ȹٷ� ������ ������, �Ӹ�����̶����
			answer="YES";
		}
		return answer;
	}

	public static void main(String[] args){
		example8 T = new example8();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.print(T.solution(str));
	}
}