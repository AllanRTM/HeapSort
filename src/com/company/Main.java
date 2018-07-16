package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numero = 100;
        while (numero < 1000000) {
            int[] aArray = new int[numero];
            long startime = System.nanoTime();
            fillRandomArray(aArray);
            heap(aArray);
            long endtime = System.nanoTime();
            long deltatime = endtime - startime;
            System.out.println("numero: " + numero + " , "+ " tiempo: " + deltatime);
            numero += numero;



        }

        System.out.println("*******************************");
    }

    static void heapify(int a[], int n, int i) {
        int Padre, hijo;
        hijo = 2 * i + 1;
        Padre = i;
        if (hijo < n)
            if (a[hijo] > a[Padre])
                Padre = hijo;
        if (hijo + 1 < n)
            if (a[hijo + 1] > a[Padre])
                Padre = hijo + 1;
        if (Padre != i) {
            int temp = a[i];
            a[i] = a[Padre];
            a[Padre] = temp;
            heapify(a, n, Padre);
        }
    }

    static void buildheap(int a[]) {
        for (int i = a.length / 2 - 1; i >= 0; i--)
            heapify(a, a.length, i);
    }

    static void heap(int a[]) {
        buildheap(a);
        for (int i = a.length - 1; i >= 1; i--) {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
    }
    private static void fillRandomArray(int[] rArray) {
        Random r = new Random();
        for (int i = 0; i < rArray.length; i++) {
            rArray[i] = r.nextInt();
        }
    }
    }

