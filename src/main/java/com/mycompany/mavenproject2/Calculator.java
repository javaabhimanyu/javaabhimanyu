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
public class Calculator {
    public static void main(String[]arg)
    {
        int a,b,c,ch;
        System.out.print("Please enter Your Two Number: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.print("Your choice 1.Add,2.sub,3.multi,4.div,5.rem : ");
        
        ch=s.nextInt();
        
        switch(ch)
                {
            case 1 -> {
                c=a+b;
                System.out.print("Add :"+c);
            }
          case 2 -> {
              c=a-b;
              System.out.print("sub :"+c);
            }
              case 3 -> {
                  c=a*b;
                  System.out.print("multi :"+c);
            }
              case 4 -> {
                  c=a/b;
                  System.out.print("div :"+c);
            }
              case 5 -> {
                  c=a%b;
                  System.out.print("rem :"+c);
            }
              default -> System.out.print("Invalid option");
    }
    
}
}
