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
public class While_loop {
    public static void main(String[]args){
        int num;
        System.out.println("Please enter any number");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while (num>=0)
        {
            if(num%2==0)
            {
                System.out.println("even number");
                break;
            }
            else
            {
                System.out.println("Odd Number");
                break;
            }
             
        }
        System.out.println("loop end");
    }
}
