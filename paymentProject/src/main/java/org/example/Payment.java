package org.example;

public class Payment {
    private String type;
    private double amount;

    public Payment(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public void processPayment() {
        if (type.equals("credit card")) {
            processCreditCardPayment();
        } else if (type.equals("paypal")) {
            processPaypalPayment();
        } else if (type.equals("cash")) {
            processCashPayment();
        } else {
            System.out.println("Invalid payment type.");
        }
    }

    private void processCreditCardPayment() {
        System.out.println("Processing credit card payment...");
    }

    private void processPaypalPayment() {
        System.out.println("Processing Paypal payment...");
    }

    private void processCashPayment() {
        System.out.println("Processing cash payment...");
    }
}

