package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("D:\\JavaStudy\\file\\phoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str="";
		String name="";
		String ph ="";
		String company="";
		while (true) {
			str = br.readLine();
			if(str==null) {
				break;
			}
			
		String[]s=str.split(",");
	
		name= s[0];
		ph=s[1];
		company=s[2];
		System.out.println("이름: "+name);
		
		System.out.println("번호: "+ph);
		System.out.println("회사: "+company);
		System.out.println("");
		}
		
		
		fr.close();

	}

}
