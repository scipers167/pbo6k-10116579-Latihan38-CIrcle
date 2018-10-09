/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class latihan38 {
    
 public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int diameter = 0;

        System.out.println("\n=============== Perhitungan Lingkaran ===============");

        do {
            try {                
                System.out.print("\nMasukan Nilai diameter Lingkaran : ");
                diameter = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Nilai Diameter tidak sesuai\n");                                          
                scanner = new Scanner(System.in);
            }      
        } while (!valid);


        circle cirlce = new circle(diameter);
        cirlce.printResult();

    }
    
    
}
