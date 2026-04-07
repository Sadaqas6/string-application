package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {

        String itemName = "Shampoo";
        double itemPrice = 3.89;
        int totalItems = 1;

        int Shampoo = 3;

        System.out.printf("Total = %.2f%n", Shampoo + itemPrice);
        System.out.println("You bought " + Shampoo + " for $" + itemPrice);
    }
}
