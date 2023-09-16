/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1_bai3;

import java.util.Scanner;

/**
 *
 * @author FPT-LAPTOP
 */
public class Lab1_bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Canh:");
        int canh = scanner.nextInt();
        int the_tich_khoi_chu_nhat = canh*canh*canh;
        System.out.println("the tich khoi chu nhat :" + the_tich_khoi_chu_nhat);
    }
}
