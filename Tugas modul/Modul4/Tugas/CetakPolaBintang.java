/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Mahasiswa
 */
public class CetakPolaBintang {
    public static void main(String[] args){
        int baris = 5;
        
        for (int i = 1; i <= baris; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
