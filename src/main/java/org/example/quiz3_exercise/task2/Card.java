package org.example.quiz3_exercise.task2;

abstract class Card {
    private String cardNo;
    private int balance;

    public Card(String cardNo, int balance){
        this.cardNo=cardNo;
        this.balance=balance;
    }
    public String getCardNo(){
        return this.cardNo;
    }
    public void setCardNo(String cardNo){
        this.cardNo=cardNo;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public abstract int increase();

    @Override
    public String toString(){
        return this.cardNo + "\n" + this.balance;
    }
}

class CreditCard extends Card{
    private int limit;

    public CreditCard(String cardNo, int balance, int limit){
        super(cardNo, balance);
        this.limit=limit;
    }
    public int getLimit(){
        return this.limit;
    }
    public void setLimit(int limit){
        this.limit=limit;
    }

    @Override
    public int increase(){
        this.limit++;
        return this.limit;
    }

    @Override
    public String toString(){
        return this.getCardNo() +"\n" + this.getBalance() + "\n" + this.limit;
    }
}

class DebitCard extends Card{
    private int deposit;

    public DebitCard(String cardNo, int balance, int deposit){
        super(cardNo, balance);
        this.deposit=deposit;
    }

    public int getDeposit(){
        return this.deposit;
    }
    public void setDeposit(int deposit){
        this.deposit=deposit;
    }

    @Override
    public int increase(){
        this.deposit++;
        return this.deposit;
    }

    @Override
    public String toString(){
        return "Card number: " + this.getCardNo() + ", balance: " + this.getBalance()
                + ", deposit: " + this.deposit;
    }
}

class Bank<T extends Card>{
    private T generic;

    public Bank(T generic){
        this.generic=generic;
    }
    public T getGeneric(){
        return this.generic;
    }
    public void setGeneric(T generic){
        this.generic=generic;
    }


}

class Main{
    public static void main(String[] args) {

        CreditCard myCreditCard = new CreditCard("1234-5678-9012-3456", 1000, 5000);
        System.out.println("Credit Card No: " + myCreditCard.getCardNo());
        System.out.println("Balance: $" + myCreditCard.getBalance());
        System.out.println("Limit: $" + myCreditCard.getLimit());

        // Increase limit and print again
        myCreditCard.increase();
        System.out.println("Updated Limit: $" + myCreditCard.getLimit());

        // Create a debit card
        DebitCard myDebitCard = new DebitCard("9876-5432-1098-7654", 500, 10);
        System.out.println("\nDebit Card No: " + myDebitCard.getCardNo());
        System.out.println("Balance: $" + myDebitCard.getBalance());
        System.out.println("Deposit: " + myDebitCard.getDeposit());

        // Increase transactions and print again
        myDebitCard.increase();
        System.out.println("Updated Deposit: " + myDebitCard.getDeposit());

        // Create a bank with a credit card
        Bank<CreditCard> myCreditCardBank = new Bank<>(myCreditCard);
        System.out.println("\nBank's Credit Card No: " + myCreditCardBank.getGeneric().getCardNo());
        System.out.println("Bank's Credit Card Limit: $" + myCreditCardBank.getGeneric().getLimit());
        System.out.println("--------------------");
        System.out.println(myCreditCard); //testing override

    }
}