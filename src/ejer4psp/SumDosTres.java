/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4psp;

/**
 *
 * @author Nabor
 */
public class SumDosTres extends Thread{
     int num;
    
    public SumDosTres(String str) {
        super(str);
    }
    
    
    public void run(){
        for(int i=0;i<=1000;i++){
            if(i%10==2 || i%10==3)
           num = num+ i;
        }
        System.out.println(getName()+num);  
    }
    
    
}
    

