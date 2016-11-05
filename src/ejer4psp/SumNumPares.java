
package ejer4psp;

/**
 *
 * @author Nabor
 */
public class SumNumPares extends Thread{
    
    public SumNumPares(String str) {
        super(str);
    }
    public void run(){
          int sum=0;
       for(int i=0;i<=1000;i=i+1){
          if(i%2==0){
           sum=sum+i;
       }
       
     }
       System.out.println(getName()+sum);
    }
}

