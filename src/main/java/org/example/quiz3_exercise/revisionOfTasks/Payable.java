package org.example.quiz3_exercise.revisionOfTasks;

interface Payable {
    public abstract String makePayment();
}

class CreditCard implements Payable{
    private String cardNo;
    private int limit;

    public CreditCard (String cardNo, int limit){
        this.cardNo=cardNo;
        this.limit=limit;
    }

    public String getCardNo(){
        return this.cardNo;
    }
    public void setCardNo(String cardNo){
        this.cardNo=cardNo;
    }
    public int getLimit(){
        return this.limit;
    }
    public void setLimit(int limit){
        this.limit=limit;
    }

    public int pay(){
        return 100;
    }
    @Override
    public String makePayment(){
        return "DC payment";
    }
}

class DebitCard implements Payable{
    public String cardNo;

    public DebitCard(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return this.cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int pay() {
        return 10000;
    }

    @Override
    public String makePayment(){
        return "DC payment";
    }
}

