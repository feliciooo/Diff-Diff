/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.renturarecur;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class RenturaRecur {
    
    public static void display_Num(int ren) {
        
        if (ren >= 1) {
            
            display_Num(ren - 1);  
            
            System.out.println(ren);  
        }
    }

    public static void main(String[] args) {
        
       Scanner JLR = new Scanner(System.in);
       
       int tura;
       
       System.out.print("Enter a number: ");
       tura = JLR.nextInt();
       
       if (tura < 1){
       
       System.out.println("Please enter a number higher than 1");
       
       }
        
       else {
       
           display_Num(tura);
       
       }
       
       
       
    }
}