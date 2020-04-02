package com.mycode.sequence;

public class SequenceTest {
    public static void main(String[] args) {
        int[] array = Sequence.of(5, 2, 8, 9, 1, 6);
        print(array);
        System.out.println(Sequence.constant(1));
    }

    private static void print(int[] array) {
        for (int i:array){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
}
