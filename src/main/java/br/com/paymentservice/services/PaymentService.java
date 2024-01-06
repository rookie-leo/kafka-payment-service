package br.com.paymentservice.services;

import models.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
