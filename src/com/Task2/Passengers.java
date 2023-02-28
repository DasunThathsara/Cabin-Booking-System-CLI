package com.Task2;

public class Passengers {
    private String FirstName, Surname, Expenses;

    public Passengers(String fn, String sn, String e) {
        this.FirstName = fn;
        this.Surname = sn;
        this.Expenses = e;
    }

    public String getFirstname() {
        return FirstName;
    }

    public String getSurname() {
        return Surname;
    }

    public String getExpenses() {
        return Expenses;
    }
}
