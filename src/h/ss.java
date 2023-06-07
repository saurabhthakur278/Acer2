package h;

import java.util.Scanner;

public class ss {
	public static void main(String args[]) {
		
		
		String str="asdf";
		
		String rev="";
		
		for(int i=str.length()-1;i>0;i--) {
			rev=rev+str.charAt(i);
			
		}
	
		
		
		System.out.println(rev);
		
		
		m1();
		System.out.println("saurabh");
	}
	
	
	
	public static void m1() {
	
		String str="wwweee";
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.reverse());
	}
	

} 
