// Created by Frantisek Novak on 5/25/2015
// Homework #1

public class Song {

    public static void main(String[] args) {

        firstDay();
        System.out.println();
        secondDay();
        System.out.println();
        thirdDay();
        System.out.println();
        fourthDay();
        System.out.println();
        fifthDay();
        System.out.println();
        sixthDay();
        System.out.println();

    }

    public static void firstDay() {

        System.out.println("On the 1st day of \"Xmas\", my true love gave to me");
        partridge();

    }
    
    public static void secondDay() {
    	System.out.println("On the 2nd day of \"Xmas\", my true love gave to me");
    	turtles();
    	partridge();
    }

    public static void partridge() {
    	System.out.println("a partridge in a pear tree.");
    }
    
    public static void turtles() {
    	System.out.println("two turtle doves, and");
    }
    
    public static void thirdDay() {
    	System.out.println("On the 3rd day of \"Xmas\", my true love gave to me");
    	hens();
    	turtles();
    	partridge();
    }
    
    public static void hens() {
    	System.out.println("three French hens,");
    }
    
    public static void fourthDay() {
    	System.out.println("On the 4th day of \"Xmas\", my true love gave to me");
    	birds();
    	hens();
    	turtles();
    	partridge();
    }
    
    public static void birds() {
    	System.out.println("four calling birds,");
    }
    
    public static void fifthDay() {
    	System.out.println("On the 5th day of \"Xmas\", my true love gave to me");
    	rings();
    	birds();
    	hens();
    	turtles();
    	partridge();
    }
    
    public static void rings() {
    	System.out.println("five golden rings,");
    }
    
    public static void sixthDay() {
    	System.out.println("On the 6th day of \"Xmas\", my true love gave to me");
    	geese();
    	rings();
    	birds();
    	hens();
    	turtles();
    	partridge();
    	
    }
    
    public static void geese() {
    	System.out.println("six geese a-laying,");
    }
    
}