package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beans.BankLoanApprover;

public class ClientApp {
    public static void main(String[] args) {
        //parent IOC container
        ApplicationContext LoanBeansIOC = new ClassPathXmlApplicationContext("loan-beans.xml");
        //child IOC container
        ApplicationContext ApprovalIOC = new ClassPathXmlApplicationContext("approval-beans.xml");

        //getbean
        BankLoanApprover approver = ApprovalIOC.getBean("bla",BankLoanApprover.class);
        System.out.println(approver.approveLoan());
    }
}
