/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahasiswa
 */
import java.util.Scanner;
public class MencetakDeretAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka bulat positif: ");
        int number = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
