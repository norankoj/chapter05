package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteBuffStreamApp {

	public static void main(String[] args) throws IOException{

		InputStream in =new FileInputStream("D:\\JavaStudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in); //연결되었다는 거예요 
		
		 OutputStream out = new FileOutputStream("D:\\JavaStudy\\file\\byteBuffer.jpg");
		 BufferedOutputStream bout =new BufferedOutputStream(out);
		 
		 int bData;
		 System.out.println("복사시작");
		 while(true) {
			 bData = bin.read();
			 if(bData==-1) {
				System.out.println("복사완료"+bData);
				 break;
			 }
			 
			 bout.write(bData);
			 
		 }
		 bin.close();
		 bout.close();
}

}
