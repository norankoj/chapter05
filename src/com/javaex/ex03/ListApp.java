package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

//아주 중요한 패턴입니다!!!!

public class ListApp {

	public static void main(String[] args) throws IOException{

		List<Add>list = new ArrayList<Add>();
		
		Reader fr =new FileReader("D:\\JavaStudy\\file\\phoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str="";
		while (true) {
			str = br.readLine();//한줄씩 읽어줌
			if(str==null) {//문자열은 -1이 아니라 없으면 끝! 
				break;
			}
			
			String[]s=str.split(",");
			Add a1 = new Add(s[0],s[1],s[2]);
			list.add(a1);
//			
//			System.out.println(a1);
//			System.out.println("");
			
		}
		
		for(Add a : list) {
			System.out.println("이름: "+a.getName());
			System.out.println("번호: "+a.getPh());
			System.out.println("회사: "+a.getCompany());
			System.out.println(""); //이렇게 하면 한번에 쫙 되고 tostring을 안써두 됩니당!! 
		}
		fr.close();
		
	
//		
//		Add a1 = new Add("정우성","011-0000-23451","02-6552-2341");
		
	}
}
