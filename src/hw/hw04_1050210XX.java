package hw;

import java.util.Scanner;
/* Author: 105021059 王俊鑌*/
public class hw04_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		 int a = scn.nextInt();
		 
		 switch(a){
		 case 1:
		   int n = scn.nextInt();
			int m = n;
			for(int i = 1 ; i<= n-3 ; i++){
			      for(int c = 1 ; c <=m-2 ; c++){
			         System.out.print("@");
			      }
			      
			      m--;
			      System.out.println();}
			    m=1;
			for(int i = 1 ; i<= n-2; i++){
			      for(int c = 1 ; c <=m; c++){
			         System.out.print("@");
			      }
			      
			      m++;
			      System.out.println();}
			break;
		 case 2:
			   n = scn.nextInt();
				 m = 1;
				for(int i = 1 ; i<= n ; i++){
				      for(int c = 1 ; c <=m-2 ; c++){
				         System.out.print("%");
				      }
				      
				      m++;
				      System.out.println();}
				  m = n;
				for(int i = 1 ; i<= n-2 ; i++){
				      for(int c = 1 ; c <=m-3 ; c++){
				         System.out.print("%");
				         
				      }
				      
				      m--;
				      System.out.println();}
			 break;
		 case 3:
			 System.out.println("請輸入奇數 ");
			 n = scn.nextInt();
			 if((float)n%2!=0) {
				 
				 
				      
		
				 m = 1;
					for(int i = 1 ; i<= n-2; i++){
					      for(int c = 1 ; c <=m-2 ; c++){
					    	  while(true){
					    		  int m2 = n;
					  			for(int d = 1 ; d<= n-3 ; d++){
					  			      for(int e = 1 ; e <=m2-2 ; e++){
					  			         System.out.print(" ");
					  			      }
					  			      
					  			      m--;
					    	  }
					         System.out.print("#");
					      }
					      
					      
					      }
					      m+=2;
					      System.out.println();
					}
				      
				      
				      
				      
				      
				      
					  m = n;
					for(int i = 1 ; i<= n ; i++){
					      for(int c = 1 ; c <=m ; c++){
					         System.out.print("#");
					         
					      }
					      
					      m-=2;
					      System.out.println();}
			 
		 
			 
			 
			 }
	    
	
		   break;
		case 4:
			
			 System.out.println("結束程式");
			 
			 break;
				    
			  

	
		 }
	}}
