package hw;
import java.util.Scanner;
/* Author: 105021059 ¤ý«T÷g*/
public class hw01_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       
       int a = 0; 
       int b = 1; 
       int temp = 0;
       for(int i=2;i<=n+1;i++ ){
    	   temp = b; 
           b = a + b; 
           a = temp; 
           System.out.println(a);
           
       }
     
	}

}
