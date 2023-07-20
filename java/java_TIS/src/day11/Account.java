package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account {
    // 필드
    private String name;
    private String account;
    private int balance;
    private String joinDate;
    private static int num = 100;

    // 생성자
    public Account() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd hh:mm:ss");
        joinDate = dtf.format(LocalDateTime.now());
    }

    // 메서드
    public void deposit(int inmoney) { // 입금
        balance += inmoney;
    }

    public boolean withdraw(int outmoney) { // 출금
        if (balance >= outmoney) {
            balance -= outmoney;
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = num++ + "-" + account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void print() {
        System.out.printf("%s\t%s\t%,d\t%s\n",
                name, account, balance, joinDate);
    }
}
