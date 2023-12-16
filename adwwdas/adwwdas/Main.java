/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner rentura = new Scanner (System.in);
        
        int x, y;
        
        System.out.println("Enter first number: ");
        x = rentura.nextInt();
        
        System.out.println("Enter second number: ");
        y = rentura.nextInt();
        
        if(x > y){
        
        System.out.println(x + " is greater than " + y);
        
        }  
        
        else if (x == y) {
            
            System.out.println("First number " + x + " and " + "Second number "+ y + " is equal number ");
        }
        
        else {
        
            System.out.println(y + " is greater than " + x);
        
        }
       
    }
}
