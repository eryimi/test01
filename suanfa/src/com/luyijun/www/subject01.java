package com.luyijun.www;


import java.util.Scanner;


public class subject01 {
	//题目1:输入一行字符，分别统计出其英文字母、空格、数字和其他字符出现的次数。
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入字符串："); 
		String str = sc.nextLine();
		System.out.println(str);
		
		char[] charArray = str.toCharArray();
		int numCount = 0;
		int abcCount = 0;
		int spaceCount = 0;
		int otherCount = 0;
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]<'9'&&charArray[i]>'0') {
				numCount++;
			}else if(charArray[i]<'z'&&charArray[i]>'a') {
				abcCount++;
			}else if(charArray[i]==' ') {
				spaceCount++;
			}else {
				otherCount++;
			}
		}
	System.out.println("英文字母出现："+abcCount+"次，数字出现："+numCount+"次，空格出现："+spaceCount+"次，其他字符出现："+otherCount+"次！");
		
	


	}
}
