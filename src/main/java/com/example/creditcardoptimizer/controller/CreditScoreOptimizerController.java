package com.example.creditcardoptimizer.controller;

import com.example.creditcardoptimizer.models.CreditAccountAgeResponse;
import com.example.creditcardoptimizer.models.CreditUsageResponse;
import com.example.creditcardoptimizer.models.PaymentHistoryResponse;
import com.example.creditcardoptimizer.service.CreditAccountAgeService;
import com.example.creditcardoptimizer.service.CreditUsageService;
import com.example.creditcardoptimizer.service.PaymentHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CreditScoreOptimizerController {
    @Autowired
    PaymentHistoryService paymentHistoryService;

    @Autowired
    CreditAccountAgeService creditAccountAgeService;

    @Autowired
    private CreditUsageService creditUsageService;

    @GetMapping("payment-history/{id}")
    public ResponseEntity<PaymentHistoryResponse> paymentHistory(@PathVariable String id){
        return new ResponseEntity<PaymentHistoryResponse>(paymentHistoryService.getPaymentHistory(id), null, HttpStatus.OK);
    }

    @GetMapping("credit-account-age/{account-id}")
    public ResponseEntity<CreditAccountAgeResponse> creditAccountAge(@PathVariable String accountId){
        return new ResponseEntity<CreditAccountAgeResponse>(creditAccountAgeService.getCreditAccountAge(accountId), null, HttpStatus.OK);
    }

    @GetMapping("credit-usage/{account-id}")
    public ResponseEntity<CreditUsageResponse> creditUsagePercentage(@PathVariable(name =  "account-id") String accountId){
       return ResponseEntity.ok(creditUsageService.getCreditUsageResponse(accountId));
     }
}
