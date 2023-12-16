/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.movietime;

/**
 *
 * @author COMLAB101
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MovieTime {

    public static void main(String[] args) {
        
    String movieQue, snackQue;
    
    Queue <String> movies = new LinkedList <>();
    Queue <String> snacks  = new LinkedList <> ();
    
    Scanner sc = new Scanner (System.in);
   
     for(int i = 1; i <= 3 ; i++){
         System.out.println( "Enter movie " + i + " of 3: ");
         movieQue = sc.nextLine();
         movies.offer(movieQue);
     }
     
     
     for(int i = 1; i <= 3 ; i++){
         System.out.println( "Enter snack" + i + " of 3: ");
         snackQue = sc.nextLine();
         snacks.offer(snackQue);
     }
     
        System.out.println("Movies to watch are: " + movies);
        System.out.println("Snacks available are: " + snacks);
        System.out.println("Press 'S' each time you finish a snack.");
     
     while(!snacks.isEmpty()){
         
        String key = sc.nextLine();
            
        if (key.equalsIgnoreCase("S")) {
           snacks.poll();
           System.out.println(snacks);
           
     }
        
     }

        if (snacks.isEmpty()) {
            System.out.println("No more snacks");
        }
    }
}