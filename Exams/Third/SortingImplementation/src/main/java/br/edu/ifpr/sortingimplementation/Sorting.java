package br.edu.ifpr.sortingimplementation;

public class Sorting {
    public static void sort(int[] array) {
        int sup = array.length - 1;
        int bubble;
        
        while(sup > 0){
            bubble = 0;
            for(int index = 0; index < sup; index++){
                if(array[index] > array[index + 1]){
                    int aux = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = aux;
                    
                    bubble = index;
                }
            }
            
            sup = bubble;
        }
    }
}
