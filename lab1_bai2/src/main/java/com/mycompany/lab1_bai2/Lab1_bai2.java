/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1_bai2;

import java.util.Scanner;

/**
 *
 * @author FPT-LAPTOP
 */
public class Lab1_bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chiều dài: ");
        int chieudai = scanner.nextInt();
        System.out.print("Chiều rộng ");
        int chieurong = scanner.nextInt();
        int dientich = chieudai*chieurong;
        int chu_vi= (chieudai+chieurong)*2;
        int canh_nho_nhat =Math.min(chieudai, chieurong);
        
        System.out.println("Diện tích :" + dientich);
        System.out.println("Chu vi :" + chu_vi);
        System.out.println("Cạnh nhỏ nhất :" + canh_nho_nhat);
    }
}
