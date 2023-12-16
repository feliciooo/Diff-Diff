/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fruits;

/**
 *
 * @author COMLAB101
 */
import java.util.*;
import java.util.EmptyStackException;

public class Fruits {

    public static void main(String[] args) {
        
        Stack <String> fruiTy = new Stack <String>();
        
        int noFru;

        
        Scanner JLR = new Scanner (System.in);
        
        
        System.out.println("Enter no. of fruits to eat: ");
        noFru = JLR.nextInt();
        
        for(int i = 1; i <= noFru; i++){
        
        System.out.println("Enter 1 - 4. \nChoose a fruit(s) to catch [A for Apple, O for Orange, M for Mango, G for Guava]: ");
       String desFru = JLR.next(). toUpperCase();
       
       if (desFru.equals("A")){
       
         fruiTy.push("Apple");
         
       } else if(desFru.equals("O")){
       
         fruiTy.push("Orange");
         
       } else if (desFru.equals("M")){
       
         fruiTy.push("Mango");
         
       } else if (desFru.equals("G")){
       
         fruiTy.push("Guava"); 
         
       } else {
       
         System.out.println("Invalid input. Please type according to the guide. ");
         
         i--;
       }
    }
        
     System.out.println("Your basket has now: " + fruiTy.toString());
     
    while (!fruiTy.isEmpty()) {

    System.out.print("Press E to eat a fruit. ");

    String eat_fruit = JLR.next().toLowerCase();

    if (eat_fruit.equals("e")) {

    fruiTy.pop();

    System.out.println("Fruit(s) in the basket: " + fruiTy);

    } else {

        System.out.println("Invalid input. Please try again. ");

    }

    }

        System.out.println("No more fruits. Cuh!!!");

    }      
}
