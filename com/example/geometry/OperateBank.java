package com.example.geometry;

public class OperateBank {
    public static void main(String[] args) {
        BankAccount ob = new BankAccount(4342956, "Prashant Kumar", 10000);
        System.out.println(ob);
        ob.withDrawMoney(20000);
        ob.withDrawMoney(-10);
        ob.withDrawMoney(5000);
        System.out.println(ob);
        ob.depositMoney(0);
        ob.depositMoney(15000);
        System.out.println(ob);
    }
}
