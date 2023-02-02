package com.shashank;
import java.util.*;
public class Balanced_para {

	public static boolean balanced(String g) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
		Stack<Character> s=new Stack<Character>();
//		String g=h;
		
		for(int i=0;i<g.length();i++) {
			if(isOpening(g.charAt(i))) {
				s.push(g.charAt(i));
			}
			else {
				if(s.isEmpty()) {
					return false;
				}
				else if(!(isMatching(s.peek(),g.charAt(i)))) {
					return false;
				}
				else{
					s.pop();
				}
			}
		}
		return s.isEmpty();

	}

	private static boolean isMatching(char a,char b) {
		if(a=='{' && b=='}') {
			return true;
		}
		else if(a=='[' && b==']') {
			return true;
		}
		else if(a=='(' && b==')') {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean isOpening(char c) {
		// TODO Auto-generated method stub
		if( c=='{'||  c=='['|| c=='(' ) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String g=sc.next();
		if(balanced(g)) {
			System.out.println("paranthesis is balanced");
		}
		else {
			System.out.println("not balanced");
		}

	}

}
