package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp2 { //메모리를 묶어서 빨리하는 걸 해보았어요 속도가 빨라요 

	public static void main(String[] args) throws IOException{

		InputStream in = new  FileInputStream("D:\\JavaStudy\\file\\img.jpg"); //빨대
		OutputStream out = new  FileOutputStream("D:\\JavaStudy\\file\\img3.jpg"); //복사본 저장
		int bData;
		byte[] buff = new byte[1024]; //1024짜리 배열로 이걸 하나하나 하면 오래되니까 묶어서 한번에 !
		System.out.println("복사시작");
		while(true) {
		 bData=in.read(buff); //***바뀐곳 
		 if(bData==-1) { 
			 System.out.println("복사가 완료되었습니다.");
			 break;
		 }
		 
		 out.write(buff);//***바뀐곳 
		 
			
		}
		in.close();
		out.close();
	}

}
