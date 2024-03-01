package org.example.final_preparation.Job;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Final {
    public static List<Job> loadJobs (String filename){
        List<Job> jobs = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            List<String> all_lines = reader.lines().toList();
            for(int i = 1; i<=all_lines.size(); i++){
                String[] temp = all_lines.get(i).split(",");
                if(temp[0].equals("") || temp[1].equals("") || temp[2].equals("")){
                    throw new InvalidCastException("Values are empty", new ClassCastException("Values are empty"));
                }
                jobs.add(
                        new Job.JobBuilder()
                                .setYear(Integer.parseInt(temp[0]))
                                .setJobTitle(temp[1])
                                .setCategory(temp[2])
                                .setCurrency(Currency.valueOf(temp[3]))
                                .setSalary(Integer.parseInt(temp[4]))
                                .setResidence(temp[5])
                                .setExperienceLevel(temp[6])
                                .setCompanyLocation(temp[7])
                                .setCompanySize(temp[8])
                                .build()
                );
            }

            reader.close();
            return jobs;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
