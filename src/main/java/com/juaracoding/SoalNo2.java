package com.juaracoding;

public class SoalNo2 {
    public static void main(String[] args) {
        int nilaiAwal = 1;
        int nilaiAkhir = 9;
        while (nilaiAwal <= nilaiAkhir) {
            for (int i = nilaiAwal; i <= nilaiAkhir; i++) {
                if (i%2==0) {
                    System.out.print("_");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
            nilaiAwal++;
            nilaiAkhir--;
        }
    }
}
