package test_p36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p36 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		String str = "Hello";
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		
		int len = str.length();
		System.out.println( str + "的第一個字元是" + ch1);
		System.out.println( str + "的第二個字元是" + ch2);
		System.out.println( str + "的長度是" + len);
	}

}
