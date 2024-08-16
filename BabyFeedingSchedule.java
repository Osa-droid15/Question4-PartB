/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.babyfeedingschedule;

/**
 *
 * @author odong
 */
import java.util.Scanner;
class BabyFeedingSchedule {
    public static void main(String[] args) {
        // Define constants
        final double PORRIDGE_CUP = 0.5; // in litres
        final double MILK_CUP = 0.5; // in litres
        final int PORRIDGE_FEED_INTERVAL = 45; // in minutes
        final int MILK_FEED_INTERVAL = 30; // in minutes
        final double INITIAL_PORRIDGE = 2.0; // in litres
        final double INITIAL_MILK = 2.0; // in litres

        // Calculate the number of feeds for porridge and milk
        int porridgeFeeds = (int) (INITIAL_PORRIDGE / PORRIDGE_CUP);
        int milkFeeds = (int) (INITIAL_MILK / MILK_CUP);

        // Calculate total time for porridge and milk feeds
        int totalPorridgeTime = porridgeFeeds * PORRIDGE_FEED_INTERVAL;
        int totalMilkTime = milkFeeds * MILK_FEED_INTERVAL;

        // Print results
        System.out.println("Total time to finish porridge: " + totalPorridgeTime + " minutes");
        System.out.println("Total time to finish milk: " + totalMilkTime + " minutes");
    }
}

