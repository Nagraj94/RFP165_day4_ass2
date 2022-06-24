package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class UC1 {
    Scanner sc = new Scanner(System.in);
    int dieRoll()
    {
        int n = 0;
        Random r = new Random();
        n = r.nextInt(7);
        return (n == 0 ? 1 : n);
    }
    void start()
    {
        String str = "r";
        int player1Position = 0;
        int diceValue = 0;
        System.out.println("Press 'r' to roll Dice");
        str = sc.next();
        diceValue = dieRoll();
        System.out.println("your dice value is: " + diceValue);
        player1Position = diceValue;
        if (str.equals("r"))
            System.out.println("player is at "+ player1Position + " position");
    }

    public static void main(String[] args) {
        UC1 uc1 = new UC1();
        uc1.start();

    }
}