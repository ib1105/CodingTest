package com.codingtest.string;

import java.util.*;
class example6 {	
	public String solution(String str){
		String answer="";
		for(int i=0; i<str.length(); i++){
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));//  indexOf �� ���ڿ��ȿ� ������ �Ǵ� ���ڿ��� ���� �� ��° ��ġ�� �����ϴ����� Ȯ���ϴ� �Լ�
			if(str.indexOf(str.charAt(i))==i) {
				answer+=str.charAt(i);
			}
		}
		return answer;
	}

	public static void main(String[] args){
		example6 T = new example6();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
}