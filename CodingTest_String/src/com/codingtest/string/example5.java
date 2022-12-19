package com.codingtest.string;

import java.util.Scanner;

class example5 {	
	public String solution(String str){
		String answer;
		char[] s=str.toCharArray();
		int lt=0, rt=str.length()-1; //lt�� ���� ���� ���ʱ���, rt�� ���� ������ ���ڷ� ���Ѵ�.
		while(lt<rt){
			if(!Character.isAlphabetic(s[lt])) {//lt�� Ư�����ڸ� +1
				lt++;
			}
			else if(!Character.isAlphabetic(s[rt])) {//rt�� Ư�����ڸ� -1
				rt--;
			}
			else{ //�Ѵ� ���ĺ��̸�
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
		}
		answer=String.valueOf(s);
		return answer;
	}

	public static void main(String[] args){
		example5 T = new example5();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}