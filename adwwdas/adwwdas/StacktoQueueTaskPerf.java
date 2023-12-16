/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stacktaskperf;

/**
 *
 * @author user
 */
import java.util.*;

public class StackTaskPerf {

    public static void main(String[] args) {
        
        Scanner jlr = new Scanner (System.in);
        
        Stack <String> stackBook = new Stack<>();
        Queue <String> queueBook = new LinkedList <>();
        
        for (int i = 1; i <= 4 ; i++){
        
        System.out.println("Title " + i + " of 4 (Books): ");
        String titleBooks = jlr.nextLine();
        
        stackBook.push(titleBooks);
        
        }
        
        while(!stackBook.isEmpty()){
        
            String titles = stackBook.pop();
            queueBook.add(titles);
            
        }
        
        System.out.println("New order list of the books: \n");
        
        while(!queueBook.isEmpty()){
        
            System.out.println(queueBook.poll());
        
        }
        
        
    }
}
