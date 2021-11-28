/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus1;

/**
 *
 * @author LIA
 */
public class AsyncRun implements Runnable {
    
    @Override
    public void run(){
            //TODO Auto-generated method stub
        try{
            System.out.println("Asyncrun.run on thread " +
            Thread.currentThread().getId());
            throw new ArithmeticException();
        }
        catch(Exception ex){
            System.out.println(ex.getClass().getName() + " handle");
        }
    }
    
    public static void main(String[]args){
        try{
            Thread t = new Thread(new AsyncRun());
            t.start();
            System.out.println("main on thread" + Thread.currentThread().getId());
            throw new NullPointerException();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getClass().getName() + " handled ");
        }
    }
}
