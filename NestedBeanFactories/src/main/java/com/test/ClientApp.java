package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beans.BankLoanApprover;

public class ClientApp {
    public static void main(String[] args) {
        // Parent IOC container
        ApplicationContext parent = new ClassPathXmlApplicationContext("loan-beans.xml");
        
        // Child IOC container with parent reference
        ApplicationContext child = new ClassPathXmlApplicationContext(
            new String[] {"approval-beans.xml"}, parent);

        // Get bean from child container
        BankLoanApprover approver = child.getBean("bla", BankLoanApprover.class);
        System.out.println(approver.approveLoan()); // Will output "Loan is approved"
    }
}