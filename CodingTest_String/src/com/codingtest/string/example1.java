package com.codingtest.string;

import java.util.Scanner;

class example1{	
	public int solution(String str, char t){
		int answer=0;
		str=str.toUpperCase();
		t=Character.toUpperCase(t);
		//System.out.println(str+" "+t);
		/*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
		}*/
		for(char x : str.toCharArray()){ //foreach���� �� �Ķ���ʹ� �迭 or �÷����̴�. �׷��� string�� ���ڹ迭�� �������Ѵ�.
			if(x==t) answer++;
		}
		
		return answer;
	}

	public static void main(String[] args){  
		example1 T = new example1();
		Scanner kb = new Scanner(System.in);
		String str=kb.next(); //next() : console â���� ���ڿ��� �ϳ� �о����
		char c=kb.next().charAt(0); //next() : console â���� ���ڿ��� �ϳ� �о����, charAt(0) : ���� �ϳ��� console â���� �о����
		System.out.print(T.solution(str, c));
	}
}