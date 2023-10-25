package org.example.week4.lecture4.CreditCard;

import java.util.Date;

public class CreditCard {
    private int cardNum;
    private Date issueDate;
    private double balance;
    private String cvc;



    private CardType cardType;
    private CardIssuer cardIssuer;

    public CreditCard(int cardNum, Date issueDate, double balance, String cvc, CardType cardType, CardIssuer cardIssuer) {
        this.cardNum = cardNum;
        this.issueDate = issueDate;
        this.balance = balance;
        this.cvc = cvc;
        this.cardType = cardType;
        this.cardIssuer = cardIssuer;
    }

    public CreditCard(double balance) {
        this.cardNum = 123;
        this.issueDate = new Date();
        this.balance = balance;
        this.cvc = "123";
        this.cardType = CardType.CREDIT;
        this.cardIssuer = CardIssuer.AMERICAN_EXPRESS;
    }


    public int getCardNum(){

        return this.cardNum;
    }
    public void setCardNum(int cardNum){

        this.cardNum = cardNum;
    }
    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardIssuer getCardIssuer() {
        return cardIssuer;
    }

    public void setCardIssuer(CardIssuer cardIssuer) {
        this.cardIssuer = cardIssuer;
    }

    public void addDeposit (double dep){
        if (dep<2){
            System.out.println("broke man keep ya dolla.");
        }
        else {
            this.balance+=dep;
        }
    }

    public void withdrawal (double w){
        if(w>this.balance){
            System.out.println("nemas brate");
        }
        else {
            this.balance-=w;
        }
    }
}
