package org.example.week5.lab.NationalService;

interface NationalService {
    int getDaysLeft();
    void work();
}

class CivilService implements NationalService {

    private int daysLeft;
    public CivilService (){
        this.daysLeft = 362;
    }

    public int getDaysLeft (){
        return daysLeft;
    }
    public void work (){
        if (this.daysLeft > 0){
            this.daysLeft--;
        }
    }
}

class MilitaryService implements NationalService{

    private int daysLeft;
    public MilitaryService (int daysLeft){
        this.daysLeft = daysLeft;
    }
    public int getDaysLeft (){
        return daysLeft;
    }
    public void work (){
        if (this.daysLeft > 0){
            this.daysLeft--;
        }
    }
}
