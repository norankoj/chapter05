package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {

	public static void main(String[] args) throws IOException{

		InputStream in = new  FileInputStream("D:\\JavaStudy\\file\\img.jpg"); //빨대
		OutputStream out = new  FileOutputStream("D:\\JavaStudy\\file\\img1.jpg"); //복사본 저장
		int bData;
		//우리의 최종목표는 카피한 다음 하드디스크에다가 저장 하는 거
		System.out.println("복사시작");
		while(true) {// 다 읽을때까지 계속 빨아드리는 것 
		 bData=in.read();//읽어 
		 if(bData==-1) { // 다 이진수 0101011이런걸 읽는 건데 데이터를 다 읽으면 -1을 써준다는 게 약속 그래서 그러면 멈춤
			 System.out.println("복사가 완료되었습니다.");
			 break;
		 }
		 
		 out.write(bData);//읽은것을 하드디스크에 쓰는 것 
		 
			
		}
		in.close();
		out.close();
	}

}
