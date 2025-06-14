package CW4.Week4.q3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //shallow copy
//        int[] original = {1, 2, 3};
//        int[] shallowCopy = original;
//
//        System.out.println(Arrays.toString(original));
//        System.out.println(Arrays.toString(shallowCopy));
//        System.out.println(" ");
//
//        original[0] = 99;
//
//        System.out.println(Arrays.toString(original));
//        System.out.println(Arrays.toString(shallowCopy));

// deep copy
        int[] original = {1, 2, 3};
        int[] deepCopy = new int[original.length];
//        deepCopy = original;

        for (int i = 0; i <original.length; i++) {
            deepCopy[i] = original[i];
        }
        deepCopy[0]= 20;

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(deepCopy));
        System.out.println(" ");

        original[0] = 99;

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(deepCopy));
    }
}
