/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1_bai4;

import java.util.Scanner;

/**
 *
 * @author FPT-LAPTOP
 */
public class Lab1_bai4 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
          System.out.print("a:");
        float a = scanner.nextFloat();
         System.out.print("b:");
        float b = scanner.nextFloat(); 
        System.out.print("c:");
        float c = scanner.nextFloat();
        float delta = (float) (Math.pow(b, 2)-4*a*c);
        float can_delta = (float) Math.sqrt(delta);
        System.out.println("Delta :" +  delta);
        System.out.println("Can Delta :" +  can_delta);
    }
}
