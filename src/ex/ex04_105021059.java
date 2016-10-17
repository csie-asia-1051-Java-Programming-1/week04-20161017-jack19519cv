package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021059 王俊鑌
 */

import java.util.Scanner;

public class ex04_105021059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int m = n;
		for(int i = 1 ; i<= n ; i++){
		      for(int c = 1 ; c <=m ; c++){
		         System.out.print("@");
		         
		      }
		      
		      m--;
		      System.out.println();}
	}

}
