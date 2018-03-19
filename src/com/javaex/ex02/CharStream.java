package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStream {

	public static void main(String[] args) throws IOException{

		Reader fr =new FileReader("D:\\JavaStudy\\file\\phoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str="";
		while (true) {
			str = br.readLine();//한줄씩 읽어줌

			if(str==null) {//문자열은 -1이 아니라 없으면 끝! 
				break;
			}
			System.out.println(str);
		}
		fr.close();
		
		
		
		
		
		
		
		
		
		
		//만든 것 
		/*Writer fw = new FileWriter("D:\\JavaStudy\\file\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		bw.write("학교종이 땡땡땡");//윈도우용 줄바꿈 
		bw.newLine();//어디서나 이렇게 쓰면 줄바꿈 가능
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");
		
		bw.close();*/
	}

}
