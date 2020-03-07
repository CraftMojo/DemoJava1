package net.craftmojo;

/*
Program tebak Angka
By      : @name
Date    : @date
Desc    : @desc
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //input
        int random, tebak, jumlah;
        random = (int)(Math.random()*50 + 1);

        System.out.println("Tebaklah Angka dari 1 - 50 ");
        Scanner masukan = new Scanner(System.in);
        jumlah = 0;

        //proses
        do {
            jumlah++;
            System.out.print("Masukkan tebakan Anda: ");
            tebak = masukan.nextInt();

            //output
            if (tebak > random) {
                System.out.println("Tebakan Anda terlalu besar");
            } else if (tebak < random) {
                System.out.println("Tebakan Anda terlalu kecil");
            } else {
                System.out.println("Tebakan Anda Benar! Setelah "
                        + jumlah + " kali menebak");
            }
        } while (tebak != random);
    }
}
