package com.juaracoding;

public class SoalNo1 {
    public static void main(String[] args) {
        System.out.println("Num |K3 |K5 | Result");
        for (int i = 1; i <= 100; i++) {
            boolean kelipatan3 = i % 3 == 0;
            boolean kelipatan5 = i % 5 == 0;
            if (kelipatan3 && kelipatan5) {
                System.out.println(String.format("%3d", i) + " | " + i%3 + " | " + i%5 + " | BIZZBUZZ");
            } else if (kelipatan3) {
                System.out.println(String.format("%3d", i) + " | " + i%3 + " | " + i%5 + " | BIZZ");
            } else if (kelipatan5) {
                System.out.println(String.format("%3d", i) + " | " + i%3 + " | " + i%5 + " | BUZZ");
            } else {
                System.out.println(String.format("%3d", i) + " | " + i%3 + " | " + i%5 + " | ");
            }
        }
    }
}