/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.runsavings;

/**
 *
 * @author user
 */
import java.util.*;

public class RunSavings {

  public static void main(String[] args) {
     
  SavingsAccount savings = new SavingsAccount();
 
  double inRate, aMount;
  char choice;
 
  try (Scanner sc = new Scanner(System.in)) {
     
  
    System.out.println("Enter interest rate: ");
      inRate = sc.nextDouble();
      
      SavingsAccount.setInterestRate(inRate);
      System.out.println("Enter deposit amount: ");
      
      aMount = sc.nextDouble();
      savings.deposit(aMount);
      
      SavingsAccount.showBalance(savings);
 
      System.out.println("Press D for another deposit or W to withdraw: ");
      choice = sc.next().charAt(0);
      
      if (choice == 'd' || choice == 'D'){
          
          System.out.println("Enter the deposit amount: ");
          aMount = sc.nextDouble();
          savings.deposit (aMount);
      
      if (aMount >= 1000){
      
          savings.addInterestRate();
      
      }
      
      System.out.println("Your new balance is: " + savings.getBalance());
      }
     
      
      if (choice == 'w' || choice == 'W'){
      
         System.out.println("Enter the amount: ");
         aMount = sc.nextDouble();
         savings.withDraw(aMount);
         System.out.println("Your new balance is: " + savings.getBalance());
      }
  }
     
    }
}