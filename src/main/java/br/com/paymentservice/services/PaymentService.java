package br.com.paymentservice.services;

import br.com.paymentservice.models.Payment;

public interface PaymentService {
    void sendPayment(Payment payment);
}
