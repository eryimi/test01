package com.luyijun.www;

public class test {
	private  volatile static int count=0;
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {

			Thread a =new Thread() {
				@Override
				public void run() {
					count++;
				}
			};
		//	a.start();
			a.run();
			//			System.out.println(count);
			System.out.println(a.getName()+":"+count);
		}


	}


}
