/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handling;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ArithmeticException {
    public static void main(String[] args) {
        //int a=100;
    //     System.out.println("Enter the value for b");
         Scanner console = new Scanner(System.in);
    // int b = console.nextInt();
     
        System.out.println("Enter the value for c");
 
    // Exception Handling
        try {
        int c = console.nextInt();
        int res=c/0;
        // 10/(b-c);    
        System.out.println(" The result is "+res);
        } 
        catch (Exception a){
            System.out.println("adalah = "+ a);
        }
    }

    ArithmeticException(String kesalahan_arithmetic_exception) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }