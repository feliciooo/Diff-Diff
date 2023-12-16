/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runsavings;

/**
 *
 * @author user
 */
public class SavingsAccount {
    
 
 public double balance;
 public static double interestRate = 0;
 public SavingsAccount(){
     
  this.balance=0;
  
 }
 
 static void setInterestRate (double newInterestRate){
 
     interestRate = newInterestRate;
 }
 
 static double getInterestRate (){
 
     return interestRate;
 }
 
 double getBalance(){
 
  return this.balance;
  
 } 
 
 void addInterestRate (){
 
     double inteRest = this.balance * (interestRate / 100.0);
     
     this.balance = this.balance + inteRest;
 }
 
void deposit (double depAmount){
 
  this.balance = this.balance + depAmount;
  
 }
 
 double withDraw (double aMount){
     
     if(this.balance >= aMount){
     
         this.balance = this.balance - aMount;
     
     } else {
     
      aMount = 0;
     }
     
     return this.balance;
 
 }
 
 static void showBalance (SavingsAccount account){
 
     System.out.println("Your balance is: " + account.getBalance());
 }
} 
