package br.edu.ifpr.sortingimplementation;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Antes: " + Arrays.toString(array));
        Sorting.sort(array);
        System.out.println("Depois: " +Arrays.toString(array));
    }
    
}
