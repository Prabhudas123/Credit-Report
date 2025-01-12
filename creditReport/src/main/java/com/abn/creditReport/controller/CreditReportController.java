package com.abn.creditReport.controller;

import com.abn.creditReport.service.CreditReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditReportController {
    @Autowired
    CreditReportService creditReportService;
    @GetMapping("/{leaseId}/creditReport")
    public ResponseEntity<String> getCreditReport(@PathVariable Integer leaseId){

        return ResponseEntity.ok(creditReportService.getCreditReport(leaseId));
    }
}
