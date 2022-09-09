/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

//import java.util.Scanner;

/**
 *
 * @author Abhimanyu Singh
 */
public class nested_if_else {
    public static void main(String []args){
        int num1=20,num2=10,num3=45;
        System.out.print("Please enter number: ");
        //Scanner obj=new Scanner(System.in);
        if(num1>num2)
        {
            if(num1>num3)
            {
            System.out.print("Maximim number: "+num1);    
        }
            else
            {
               System.out.print("Maximim number: "+num3); 
            }
    }
   else
        {
           if(num2>num3) 
           {
               System.out.print("Maximim number: "+num2);
           }
           else
           {
        
           }
}
}
}