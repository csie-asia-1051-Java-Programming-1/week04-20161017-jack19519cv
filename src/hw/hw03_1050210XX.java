package hw;
import java.util.Scanner;
/* Author: 105021059 ���T�g*/
public class hw03_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=0, n=0, z=0;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("��J�Ʀr");
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
            System.out.println(p + " ����");
    	    System.out.println( n + " �t��");
    	    System.out.println( z + " �s");
    	    System.out.println("�O�_�~��(Y/n)");
    	    char j=scn.next().charAt(0);
		      if (j=='n'|| j=='N'){
		    	  
		    	 
		    	  System.out.println("�{������");
                      break;
                      }else{System.out.println("�~���J");
                    	 p=0;
                    	 n=0;
                    	 z=0;
                    	 a = scn.nextInt();  
                      }
        }
	}
}

