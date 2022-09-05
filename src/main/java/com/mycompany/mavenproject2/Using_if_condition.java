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
public class Using_if_condition {
    public static void main(String []arg){
        int pwd;
        System.out.print("Please Enter Password: ");
        Scanner obj=new Scanner(System.in);
        pwd=obj.nextInt();
        if(pwd==1234)// if password is worng so not working if condition
        {
            System.out.println("My name is Abhimanyu");
            System.out.println("age 24");
            System.out.println("Add - Bihar");
            
        }   
        
       // System.out.println("Wrong password enter ");
    }
    
}
