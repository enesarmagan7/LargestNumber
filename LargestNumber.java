package Letcode;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        int enBuyuk = 0;
        int enKucuk = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if (i == 1) {
                enBuyuk = sayi;
                enKucuk = sayi;
            } else {
                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                }
                if (sayi < enKucuk) {
                    enKucuk = sayi;
                }
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);


        }
    }
