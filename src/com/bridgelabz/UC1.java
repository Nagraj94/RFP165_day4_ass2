package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class UC1 {
    Scanner sc = new Scanner(System.in);
    void start()
    {
        System.out.println("enter to start");
        int enter = sc.nextInt();
    }
    public int dies()
    {
        int n=0;
        Random r = new Random(7);
        n = r.nextInt();
        return(n==0?1:n);
    }
    public static void main(String[] args) {
        UC1 s = new UC1();
        s.start();
        s.dies();
    }
}
