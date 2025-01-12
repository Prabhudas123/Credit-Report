package com.abn.creditReport.service;

import org.springframework.stereotype.Service;

@Service
public class CreditReportService {

    public String getCreditReport(Integer leaseId){
        return "Credit Report is Good";
    }
}
