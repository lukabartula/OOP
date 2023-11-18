package org.example.quiz3_exercise.revisionOfTasks;

abstract class Card {
    private String cardNo;
    private int balance;

    public String getCardNo(){
        return this.cardNo;
    }
    public void setCardNo(String c){
        this.cardNo=c;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setBalanceš(int b){
        this.balance=b;
    }
}
