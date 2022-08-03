/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.myfirstapp;

import java.util.Scanner;


/**
 *
 * @author HP
 */
public class MyFirstApp {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        
        for(int i=0; i<input.length()-1;i++){
        
            if(input.charAt(i)!= input.charAt(input.length()-1-i)){
                System.out.println("No mirror");
                System.out.println(input.charAt(i));
                break;
            }
            else{
                System.out.println("Mirror");
                System.out.println(input.charAt(i));
                break;
            }
        }
    }
   
}



