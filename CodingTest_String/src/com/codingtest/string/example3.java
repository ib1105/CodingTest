package com.codingtest.string;

import java.util.*;
class example3 {	
	public String solution(String str){
		
		String answer="";
		int m=Integer.MIN_VALUE; //�������� ������ �ʱ�ȭ��
		String[] s = str.split(" "); //����� �и��Ͽ� �迭�� ����
		
		for(String x : s){
			int len=x.length();
			if(len>m){
				m=len;
				answer=x;
			}
		}
		return answer;
	}

	public static void main(String[] args){
		example3 T = new example3();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine(); //�ܾ �ƴ϶� ���� �Է��ؾ��ϹǷ� nextLine();
		System.out.print(T.solution(str));
	}
}


