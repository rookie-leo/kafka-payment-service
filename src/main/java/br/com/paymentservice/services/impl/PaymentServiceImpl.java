package br.com.paymentservice.services.impl;

import br.com.paymentservice.services.PaymentService;
import lombok.extern.log4j.Log4j2;
import br.com.paymentservice.models.Payment;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("Payment {} received", payment);
    }
}
