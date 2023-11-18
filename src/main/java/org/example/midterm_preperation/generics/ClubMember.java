package org.example.midterm_preperation.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ClubMember implements Comparable<ClubMember>{
    private String name;
    private int height;

    public ClubMember(String name, int height){
        this.name = name;
        this.height = height;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHeight(){
        return this.height;
    }
    public void setHeight(int height){
        this.height=height;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + ", height: " + this.height;
    }
    @Override
    public int compareTo(ClubMember clubMember){
        if(this.height==clubMember.getHeight())
            return 0;
        else if (this.height<clubMember.getHeight())
            return -1;
        else
            return 1;
    }
}

class StarterG {
    public static void main(String[] args) {
        List<ClubMember> clubMembers = new ArrayList<ClubMember>();
        clubMembers.add(new ClubMember("mikael", 182));
        clubMembers.add(new ClubMember("matti", 187));
        clubMembers.add(new ClubMember("joel", 184));

        System.out.println(clubMembers);
        Collections.sort(clubMembers);
        System.out.println(clubMembers);
    }
}
