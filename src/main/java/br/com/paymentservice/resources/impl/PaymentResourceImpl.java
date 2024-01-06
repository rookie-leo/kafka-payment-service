package br.com.paymentservice.resources.impl;

import br.com.paymentservice.resources.PaymentResource;
import br.com.paymentservice.services.PaymentService;
import lombok.RequiredArgsConstructor;
import models.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentResourceImpl implements PaymentResource {
    private final PaymentService paymentService;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {
        paymentService.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
