package com.pack;

import java.util.Scanner;

public class Vowel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input : ");
		
		ch=sc.next().charAt(0);
		if((ch=='a')||(ch=='a')||(ch=='E')||(ch=='e')||(ch=='I')||(ch=='i')||(ch=='O')||(ch=='o')||(ch=='U')||(ch=='u'))
		{
			System.out.println("Output : vowels");
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println("Output : consonants");
		}
		else
		{
			System.out.println("Output : Invalid");
		}
		
	}

}
