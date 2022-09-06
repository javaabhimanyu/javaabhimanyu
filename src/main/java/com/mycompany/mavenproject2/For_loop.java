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
public class For_loop {
    public static void main(String[]args){
     int num;
     System.out.print("Enter the Number");
     Scanner w=new Scanner (System.in);
     num=w.nextInt();
     for(int i=0;i<=10;i++)
     {
         System.out.println(num*i);
     }
}
}
