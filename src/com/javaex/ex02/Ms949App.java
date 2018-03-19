package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ms949App {

	public static void main(String[] args) throws IOException{
		
		InputStream is = new FileInputStream("D:\\JavaStudy\\file\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(is,"MS949");
		BufferedReader br = new BufferedReader(isr);
		
		String line ="";
		while(true) {
			line = br.readLine();
			if(line == null) {
				break;
			}
			
			System.out.println(line);
			
		}
		
		
		br.close();

		
		
	}

}
