package org.example.week10.lecture;


@VeryImportant
public record Lion(String name) {
    @RunImmediately
    public void saySomething() {
        System.out.println("Lion method saySomething");
    }
    public void saySomethingButDontRun() {
        System.out.println("Lion method saySomethingButDontRun");
    }
    @RunImmediatelyNTimes(times = 3)
    public void runMultipleTimes(){
        System.out.println("Multiple times");
    }
}

