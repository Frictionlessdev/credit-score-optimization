package com.example.creditcardoptimizer.controller;

import models.PaymentHistoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PaymentHistoryService;

@RestController
@RequestMapping("/")
public class CreditScoreOptimizerController {
    @Autowired
    PaymentHistoryService paymentHistoryService;

    @GetMapping("payment-history/{id}")
    public ResponseEntity<PaymentHistoryResponse> paymentHistory(@PathVariable String id){
        return new ResponseEntity<PaymentHistoryResponse>(paymentHistoryService.getPaymentHistory(id), null, HttpStatus.OK);
    }
}
