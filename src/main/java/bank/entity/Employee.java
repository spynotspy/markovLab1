package bank.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Getter
@AllArgsConstructor
@ToString
public class Employee {
    private String id;
    private String fullName;
    private Date birthDate;
    private String position;
    private Bank bank;
    private boolean worksRemotely;
    private BankOffice bankOffice;
    private boolean canIssueCredits;
    private double salary;
}
