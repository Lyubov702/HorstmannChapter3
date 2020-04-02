package com.mycode.sequence;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*4. Implement a static of method of the IntSequence class that yields a sequence
        with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
        sequence with six values. Extra credit if you return an instance of an
        anonymous inner class.
 5. Add a static method with the name constant of the IntSequence class that
         yields an infinite constant sequence. For example, IntSequence.constant(1)
        yields values 1 1 1..., ad infinitum. Extra credit if you do this with a
        lambda expression.*/

public class Sequence {

    public static int[] of(int... number) {
        return new IntSequence() {
            @Override
            public int[] of(int... number) {
                int[] args = new int[6];
                int j = 0;
                for (int i : number) {
                    args[j] = i;
                    j++;
                }
                return args;
            }
        }.of(number);
    }

    public static List<Integer> constant(int number) {
        Stream<Integer> infiniteStream = Stream.iterate(number, i -> number);
        List<Integer> collect = infiniteStream
                .limit(1000000000)
                .collect(Collectors.toList());
        return collect;

    }
}

