/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;
public class LoopDoWhile {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
int bilangan;
int jumlah = 0;

do{
    System.out.print("Masukan bilangan positif (masukan bilangan negatif untuk berhenti : ");
    bilangan = scanner.nextInt();
    if (bilangan >= 0){
        jumlah += bilangan;
    } 
} while (bilangan >= 0);
System.out.println("Jumlah bilangan positif yang dimasukan: " + jumlah);
        }
    }

