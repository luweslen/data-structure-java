
package br.edu.ifpr.exercise5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        Object newItems[] = new Object[3];
        
        stack.push(0);
        
        newItems[0] = 1;
        newItems[1] = 2;
        newItems[2] = 3;
        
        stack.pushAll(newItems);
        Object removedItems[] = stack.popN(3);
        
        System.out.println(Arrays.toString(removedItems));
        System.out.println(stack.toString());
    }
    
}
