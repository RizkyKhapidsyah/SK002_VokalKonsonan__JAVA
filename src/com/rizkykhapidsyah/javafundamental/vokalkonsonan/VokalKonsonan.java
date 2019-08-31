package com.rizkykhapidsyah.javafundamental.vokalkonsonan;

import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {
        /* Kamus */
        String word = "";
        int vokal = 0;
        int konsonan = 0;

        /* Program */
        System.out.print("Masukkan Kalimat: ");
        Scanner ScanInput = new Scanner(System.in);
        word = ScanInput.nextLine();

        /*
            Untuk mendapat nilai balik atau nilai yang dikirimnya dari metode yang telah dibuat, jangan lupa untuk
            panggil fungsi tersebut. Lalu simpan nilai baliknya.
         */

        //Memanggil Prosedur Yang Mengembalikan Nilai int
        vokal = num_vokal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah Huruf Vokal     : " + vokal + " Huruf");
        System.out.println("Jumlah Huruf Konsonan  : " + konsonan + " Huruf");
    }

    //Dulu waktu kita SD, kita masih ingat kaan bahwa huruf vokal dalam Bahasa Indonesia hanya ada 5: a,i,u,e,o. Maka, berikut:

    //Fungsi Untuk Mendefinisikan Mana Aja Huruf Vokal
    private static int num_vokal(String word) {
        int i;
        int jumlah_vokal = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' ||
                    word.charAt(i) == 'i' ||
                    word.charAt(i) == 'u' ||
                    word.charAt(i) == 'e' ||
                    word.charAt(i) == 'o') {
                jumlah_vokal++;
            }
        }
        return jumlah_vokal;
    }

    //Fungsi Untuk Mendifinisikan Mana Aja Huruf Konsonan (Dengan cara: terkecualikan huruf vokal)
    private static int num_konsonan(String word) {
        int i;
        int jumlah_konsonan = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' &&
                    word.charAt(i) != 'i' &&
                    word.charAt(i) != 'u' &&
                    word.charAt(i) != 'e' &&
                    word.charAt(i) != 'o') {
                jumlah_konsonan++;
            }
        }
        return jumlah_konsonan;
    }
}
