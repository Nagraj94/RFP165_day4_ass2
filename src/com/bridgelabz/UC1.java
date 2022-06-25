package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class UC1 {

    int checkOption;
    Scanner sc = new Scanner(System.in);
    static Map< Integer,Integer > snake = new HashMap< Integer , Integer >();
    static Map < Integer , Integer > ladder = new HashMap< Integer , Integer >();
    {
        snake.put(99,54);
        snake.put(70,55);
        snake.put(52,42);
        snake.put(25,2);
        snake.put(95,72);

        ladder.put(6,25);
        ladder.put(11,40);
        ladder.put(60,85);
        ladder.put(46,90);
        ladder.put(17,69);
    }

    /*
    created method to check option that player got snake, ladder or no play.
    */
    int checkForOption(int player1Position, int diceValue)
    {
        int playerNewPosition = player1Position + diceValue;
        if (playerNewPosition < 0)
            System.out.println("no play");
        if(null != snake.get(playerNewPosition))
        {
            System.out.println("Oops..swallowed by the snake..");
            playerNewPosition=snake.get(playerNewPosition);
        }
        if (null != ladder.get(playerNewPosition))
        {
            System.out.println("hurry! climbing the ladder");
            playerNewPosition = ladder.get(playerNewPosition);
        }
        return playerNewPosition;
    }
    int dieRoll()
    {
        int n = 6;
        Random r = new Random();
        n = r.nextInt(7);
        return (n == 0 ? 1 : n);
    }
    void start()
    {
        int player1Position = 0;
        int diceValue = 0;
        String str = "r";
        int currentPlayer = -1;
        do {
            System.out.println("Press 'r' to roll Dice");
            str = sc.next();
            diceValue = dieRoll();
            System.out.println("your dice value is: " + diceValue);
            player1Position = diceValue;
            System.out.println("you are at " + player1Position + " position.");

        }
        while ("r".equals(str));
    }

    public static void main(String[] args) {
        UC1 uc1 = new UC1();
        uc1.start();

    }
}