package test_p34;
import java.io.*;

public class p34 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("請輸入一個整數");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String tr = br.readLine();
		int num = Integer.parseInt(tr);
		System.out.println("您輸入的數字是" + num);
	}

}
