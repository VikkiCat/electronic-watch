package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int S = seconds%60;
        int H = seconds/60;
        int M = H%60;
        H = H/60;
        if(H>=24) H = 0;
        System.out.println(H + ":" + String.format("%02d",M) + ":" + String.format("%02d",S));

    }
}
