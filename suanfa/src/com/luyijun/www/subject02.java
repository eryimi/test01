package com.luyijun.www;

import java.util.Scanner;

public class subject02 {
	public static void main(String[] args) {
		//题目2:利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示，如果离特殊线分数x差5分的用D表示。
        char grade;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("请输入一个成绩: ");
        int  m = sc1.nextInt();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.print("请输入特殊线分数: ");
        int  x = sc2.nextInt();
         
        grade = m >= 90 ? 'A' : m >= 60 ? 'B' : 'C';
        if(x-m == 5) {
        	grade='D';
        }
        System.out.println("等级为：" + grade);
        
        sc1.close();
        sc2.close();
    }
		
	
}
