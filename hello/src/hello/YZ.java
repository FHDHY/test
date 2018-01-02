package hello;

import java.util.Scanner;
public class YZ {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
				
		System.out.print("请输入一个数");
		
		int b=sc.nextInt();
		shuchu(b);
	}
	public static void shuchu(int b){
		for(int i=0;i<=b;i++){
			System.out.println(i);
		}
	}
	
}

