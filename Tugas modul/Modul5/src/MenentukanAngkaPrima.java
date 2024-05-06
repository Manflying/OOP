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
public class MenentukanAngkaPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int number = scanner.nextInt();
        scanner.close();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
} else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } if (isPrime) {
            System.out.println("Bilangan tersebut adalah bilangan prima");
} else {
            System.out.println("Bilangan tersebut bukan bilangan prima");
        }
    }
}