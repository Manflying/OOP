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
public class MengkonversiCelciusKeFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan suhu dalam derajat Celsius: ");
        double celsius = scanner.nextDouble();
        scanner.close();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.2f derajat Celsius sama dengan %.2f derajat Fahrenheit\n",
                celsius, fahrenheit);
    }
}
