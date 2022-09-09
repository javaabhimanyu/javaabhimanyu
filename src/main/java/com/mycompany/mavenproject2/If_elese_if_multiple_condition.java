/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author Abhimanyu Singh
 */
public class If_elese_if_multiple_condition {
 public static void main(String []args)
 {
     int marks;
     System.out.print("Enter marks: ");
     Scanner obj=new Scanner(System.in);
     marks=obj.nextInt();
     if( marks>=60 && marks<=100 )
      {
        System.out.print("First");         
       }
     else if(marks>=45 && marks<=59)
     {
        System.out.print("Second");  
     }
     else if( marks>=35 && marks<=45)
     {
       System.out.print("Third");   
     }
     else
     {
       System.out.print("fail");   
     }  
     }
     }
 

