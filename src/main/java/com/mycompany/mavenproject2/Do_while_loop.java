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
public class Do_while_loop {
   public static void main(String[]args){
        int num;
        System.out.println("Please enter any number");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
     do
        {
           System.out.print(num+" ");
           ++num;
        }
       while (num<=10);
    }
}
