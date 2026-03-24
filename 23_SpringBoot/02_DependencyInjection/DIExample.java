package com.example.demo.di;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;

// --- Bean 1: PaymentService ---
@Service
class PaymentService {
    public String processPayment(double amount) {
        return "Payment of ₹" + amount + " processed successfully.";
    }
}

// --- Bean 2: NotificationService ---
@Service
class NotificationService {
    public void sendConfirmation(String message) {
        System.out.println("Notification sent: " + message);
    }
}

// --- Bean 3: OrderService (depends on PaymentService + NotificationService) ---
// Constructor Injection — recommended approach
@Service
public class DIExample {

    private final PaymentService paymentService;
    private final NotificationService notificationService;

    // Spring automatically injects both services via constructor
    public DIExample(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    public void placeOrder(String item, double price) {
        System.out.println("Placing order for: " + item);
        String result = paymentService.processPayment(price);
        notificationService.sendConfirmation(result);
    }
}
