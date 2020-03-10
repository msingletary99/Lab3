/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
import java.util.Scanner;
public class isEvenOrOdd {
    System.out.println("Please input a whole number");

    public static void main(String[] args) {

    }

    public static int isEvenOrOdd(int number) {
        int flag = 0;
        if (number % 2 == 0) {
            flag = 1;
        } else {
            flag = 0;
        }
        return flag;
    }

    //create a method
    //create a loop
    //generate 100 random numbers
    //analyze the numbers in a if else
    //if number%2=0, even totalEven=totalEven+1
    //else, odd, totalOdd=totalOdd+1
    //display number of even
    //display number of odds
}
