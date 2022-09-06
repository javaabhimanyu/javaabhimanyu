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
public class Voting {
   public static void main(String []arg){
    int age;
    System.out.print("Please enter your age: ");
    Scanner obj=new Scanner(System.in);
    age=obj.nextInt();
    if (age>=18)
    {
        System.out.print("You are eligible for voting");
    }else
        System.out.print("You are not eligible for voting");
} 
}
