package string;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) {
		
		byte[] bytes = new byte[100];
		
		System.out.print("ют╥б: " );
		
		
		try {
			int readByteNo = System.in.read(bytes);
			
			String str = new String(bytes, 0, readByteNo-2);
			System.out.println(str);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		
	}
}
