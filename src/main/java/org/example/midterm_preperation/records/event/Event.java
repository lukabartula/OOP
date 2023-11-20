package org.example.midterm_preperation.records.event;

import java.util.Arrays;
import java.util.List;

/*Define a record named Event with attributes: eventId (int), eventName (String),
 location (String), and attendance (int). Implement a class named EventManager with
 a method named findAverageAttendance, which accepts a list of events and calculates
  the average attendance.
 */
record Event(int event_id, String event, String location, int attendance) {}

class EventManager{

    public static double findAverageAttendance(List<Event> events){
         return events.stream()
                .mapToDouble(att -> att.attendance())
                .average()
                 .orElse(0.0);
    }
}

class Main{
    public static void main(String[] args) {
        List<Event> movies = Arrays.asList(
                new Event(111, "Central Clubbing", "Sarajevo", 1000),
                new Event(222, "Laganini events", "Zenica", 202020),
                new Event(333, "Kod saketa","Sarajevo", 2002020)
        );

        System.out.println(EventManager.findAverageAttendance(movies));
    }
}