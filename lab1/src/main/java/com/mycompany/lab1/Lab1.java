/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author FPT-LAPTOP
 */
public class Lab1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();
        System.out.println("Họ và tên::" + hoTen);
        System.err.println("Điểm TB:" + diemTB);
        
    }
}
