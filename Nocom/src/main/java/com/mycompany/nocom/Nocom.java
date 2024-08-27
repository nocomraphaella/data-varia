/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nocom;
import java.util.Scanner;

/**
 *
 * @author CL3-PC30
 */
public class Nocom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z;        
        System.out.println("Enter A Number:");
        x = input.nextInt();
        System.out.println("Enter A Number:");
        y = input.nextInt();
        
        z = x + y;
        
        System.out.println("The Sum of 2 number is :" +z);
    }
}
