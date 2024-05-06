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
public class MemasukanAngkaBulan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor bulan (1-12): ");
        int monthNumber = scanner.nextInt();
        scanner.close();
        String monthName;
        switch (monthNumber) {
            case 1: monthName = "Januari"; break;
            case 2: monthName = "Februari"; break;
            case 3: monthName = "Maret"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "Mei"; break;
            case 6: monthName = "Juni"; break;
            case 7: monthName = "Juli"; break;
            case 8: monthName = "Agustus"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "Oktober"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "Desember"; break;
            default: monthName = "Angka bulan tidak valid";
        }
        System.out.println(monthName);
    }
}