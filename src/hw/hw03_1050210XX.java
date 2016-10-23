package hw;
import java.util.Scanner;
/* Author: 105021059 王俊鑌*/
public class hw03_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0, n=0, z=0;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入數字");
		int a = scn.nextInt();
		
		while(true){
		  while (a != 999){
			
            if(a < 0)
            {
                n++;
            }
            else if(a == 0)
            {
                z++;
            }
            else if(a>0)
            {
                p++;
            } 
             a = scn.nextInt();
		  }
            System.out.println(p + " 正數");
    	    System.out.println( n + " 負數");
    	    System.out.println( z + " 零");
    	    System.out.println("是否繼續(Y/n)");
    	    char j=scn.next().charAt(0);
		      if (j=='n'|| j=='N'){
		    	  
		    	 
		    	  System.out.println("程式結束");
                      break;
                      }else{System.out.println("繼續輸入");
                    	 p=0;
                    	 n=0;
                    	 z=0;
                    	 a = scn.nextInt();  
                      }
        }
	}
}

