package hw;
import java.util.Scanner;
/* Author: 105021059 ¤ý«T÷g*/
public class hw02_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int i =1,sum =1,sum2 =1,a =1 ;
		
		while(i <= n   ){
			sum*=i;i++;
			}
		while(a <= m){
			sum2*=a;a++;}
		
		if( n-m == 0){ System.out.println(sum/(sum2*(1)));
		}else{int  b = n-m,c=1,sum3 =1;
		
		while(c <= b){
			sum3*=c;c++;}
	System.out.println(sum/(sum2*(sum3)));
	}
}
}