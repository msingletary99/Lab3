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

        double gallonsOfPaint = getTotalGallons(totalSqFeet);
        System.out.println("Total Gallons Needed: " + gallonsOfPaint);

        double timeForLabor = getLaborTime(totalSqFeet);
        System.out.println("Total Labor Hours: " + timeForLabor);

        double totalPaintPrice = getCostOfPaint(gallonsOfPaint, paintPricePerGallon);
        System.out.println("Total Cost of Paint: $" + totalPaintPrice);

        double totalLaborPrice = getCostOfLabor(timeForLabor);
        System.out.println("Total Cost of Labor: $" + totalLaborPrice);

        double totalEstimate = getEstimate(totalPaintPrice, totalLaborPrice);
        System.out.println("Total Estimate: $" + totalEstimate);

    }

    //Method 1
    //calculate number of gallons of paint needed
    // method needs totalSqFeet
    //return totalGallons
    public static double getTotalGallons(double totalSqFeet) {
        double totalGallons = Math.ceil(totalSqFeet / 115);
        return totalGallons;
    }
    //Method 2
    //calculate labor time
    // methid needs total sqaure footage
    //return labor time
    public static double getLaborTime(double totalSqFeet) {
        double totalLaborTime = Math.ceil((totalSqFeet / 115) * 8);
        return totalLaborTime;
    }
    //Method 3
    //Calculate total paint price
    //method needs totalGallons, priceOfPaint
    //return totalPaintPrice
    public static double getCostOfPaint(double gallonsOfPaint, double paintPricePerGallon) {
        double totalCostOfPaint = gallonsOfPaint * paintPricePerGallon;
        return totalCostOfPaint;
    }
    //Method 4 
    //calculate total labor price
    //needs total labor time, priceOfLabor
    //return labor price
    public static double getCostOfLabor(double timeForLabor) {
        double costOfLabor = timeForLabor * 18;
        return costOfLabor;
    }
    // Method 5
    //Calculate total price
    //needs totalLaborPrice and totalPaintPrice
    //return totalPrice
    public static double getEstimate(double totalPaintPrice, double totalLaborPrice) {
        double finalEstimate = totalPaintPrice + totalLaborPrice;
        return finalEstimate;
    }
}
