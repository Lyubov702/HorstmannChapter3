package com.mycode.runnable;

public class Greeter implements Runnable {
    private String target;
    private int number;

    public Greeter(String target, int number) {
        this.target = target;
        this.number = number;
    }

    public String getTarget() {
        return target;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void run() {
        for(int i=0; i<this.getNumber();i++){
            System.out.println("Hello, "+this.getTarget());
        }
    }

    public static void main(String[] args) {
        new Thread(new Greeter("you",4)).start();
        new Thread(new Greeter("me",2)).start();

    }
}
