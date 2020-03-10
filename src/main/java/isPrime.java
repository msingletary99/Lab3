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

public class isPrime {

    public static void main(String[] args) {
        //prompt user to input the whole number they wish to analyze
        System.out.println("Plese input a whole number.");

        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();


        int flag = isPrime(number);

        if (flag >= 1) {
            System.out.println("not prime");
        } else if (flag == 0) {
            System.out.println("prime");
        }
        //have user input number and set it equal to some int variable
        //isPrime(number) --> to method
        //set a method for isPrime procedure
        //if it is 0 or 1, not prime
        //else run a do while loop
        //i=2;i<number; i++
        //modular division
        //create a flag so that it will go until flag is activated
        //modualr division=1, flag=0
        //modular division=0, flag=1
        //when flag is activated number isPrime
    }

    public static int isPrime(int number) {
        int flag = 0;
        if (number == 0 || number == 1||number ==2) {
            flag = 0;
        } else if (number > 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = flag + 1;
                }else if(number%i==1){
                    flag=flag+0;
                }
            }
        }

        return flag;
    }
}
