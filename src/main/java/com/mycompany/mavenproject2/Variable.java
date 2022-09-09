/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//
package com.mycompany.mavenproject2;
//import.util.java*;
/**
 *
 * @author Abhimanyu Singh
 */

public class Variable {
   int a=10; //instance Value
   static double b=20.5; // static variable
   public static void main(String [] args  ){
       Variable Son=new Variable();
       System.out.println(Son.a);
       System.out.println(Variable.b);
      
    
}
}
