package com.mycode.superclass;

import javax.imageio.stream.ImageOutputStream;
import java.util.Scanner;

/*3. What are all the supertypes of String? Of Scanner? Of ImageOutputStream? Note
        that each type is its own supertype. A class or interface without declared
        supertype has supertype Object.*/

public class Superclass {
    public static void main(String[] args) {
        System.out.println(String.class.getSuperclass());
        System.out.println(Scanner.class.getSuperclass());
        System.out.println(ImageOutputStream.class.getSuperclass());
    }
}
