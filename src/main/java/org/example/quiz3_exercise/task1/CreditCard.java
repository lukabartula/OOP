package org.example.quiz3_exercise.task1;


interface Payable{
    public abstract String makePayment();
}
class CreditCard implements Payable {
    private String cardNo;
    private int limit;

    public CreditCard(String cardNo, int limit){
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
        return "CD payment";
    }
}

class debitCard implements Payable{
    private String cardNo;

    public debitCard(String cardNo){
        this.cardNo=cardNo;
    }
    public String getCardNo(){
        return this.cardNo;
    }
    private void setCardNo(String cardNoo){
        this.cardNo=cardNo;
    }
    public int pay(){
        return 10000;
    }
    @Override
    public String makePayment(){
        return "DC payment";
    }
}

class Main{
    public static void main(String[] args) {
        CreditCard cd=new CreditCard("123",100);
        debitCard dc=new debitCard("234");
        System.out.println(cd.pay());
        System.out.println(cd.makePayment());
        System.out.println("-----------------------");
        System.out.println(dc.pay());
        System.out.println(dc.makePayment());
    }
}
