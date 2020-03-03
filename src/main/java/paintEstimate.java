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

public class paintEstimate {

    public static void main(String[] args) {
        int totalSqFeet = 0;

        System.out.println("Please input the number of rooms that need painted?");
        Scanner keyboard = new Scanner(System.in);
        int numberOfRooms = keyboard.nextInt();

        System.out.println("How much is the paint you want per gallon?");
        double paintPricePerGallon = keyboard.nextDouble();

        for (int i = 1; i <= numberOfRooms; i++) {
            System.out.println("How many Sqaure feet are in room " + i + "?");
            int sqFeetPerRoom = keyboard.nextInt();
            totalSqFeet = sqFeetPerRoom + totalSqFeet;
        }

        double rateForConversion = totalSqFeet / 115;

        double gallonsOfPaint = Math.ceil(rateForConversion);
        System.out.println("Required Gallons of Paint: " + gallonsOfPaint);

        double totalLaborTime = rateForConversion * 8;
        System.out.println("Total Labor Hours: " + totalLaborTime);

        double totalPaintPrice = gallonsOfPaint * paintPricePerGallon;
        System.out.println("Total Cost of Paint: $" + totalPaintPrice);
        
        double totalLaborPrice = totalLaborTime*18;
        System.out.println("Total Cost of Labor: $" + totalLaborPrice);
        
        double totalEstimate= totalLaborPrice+totalPaintPrice;
        System.out.println("Total Estimate: $" + totalEstimate);

    }

}
