package com.bridgelabz;

import java.util.Scanner;

public class UC1 {
    Scanner sc = new Scanner(System.in);
    void start()
    {
        String str = "r";
        int player1Position = 0;
        System.out.println("Press 'r' to roll Dice");
        str = sc.next();
        if (str.equals("r"))
            System.out.println("player is at "+ player1Position + " position");
    }

    public static void main(String[] args) {
        UC1 uc1 = new UC1();
        uc1.start();
    }
}
