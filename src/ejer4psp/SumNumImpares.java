
package ejer4psp;

/**
 *
 * @author Nabor
 */
public class SumNumImpares extends Thread {
    int num;
    public SumNumImpares(String str) {
        super(str);
    }

   
    
     public void run(){
        for(int i=0;i<=1000;i++){
            if(i%2!=0)
            num = num+ i;
        }
        System.out.println(getName()+num);  
    }
}
