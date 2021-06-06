/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joseph Ratchford
 */import java.util.Scanner;
public class Driving {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int age;
        // This print how old the person is in the program
        System.out.print(" What is your age? ");
        age = scan.nextInt();


        // tells the user that if you are younger than 16 you can't legally drive
        if(age < 16)
        {
            System.out.println(" You are not old enough to legally drive.");
        }
        else
        {
            System.out.println(" You are old enough to legally drive.");
        }


    }
}
