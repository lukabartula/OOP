package org.example.final_preparation;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private List<Item> items;

    public ReadFile(String filename){

    }

    public List<Item> getItems() {
        return items;
    }

    public static List<Item> readFromFile(String filename){

        List<Item> itemList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            List<String> all_lines = reader.lines().toList();
            for(int i = 1; i<all_lines.size(); i++){
                String[] temp = all_lines.get(i).split(";");
                if(temp[0].equals("") || temp[1].equals("") || temp[3].equals("")){
                    throw new InvalidCastException("Essential field(s) empty.");
                }
                itemList.add(
                        new Item.ItemBuilder()
                                .setDate(new SimpleDateFormat("MM/dd/yyyy").parse(temp[0]))
                                .setQuarter(temp[1])
                                .setQuantity(Integer.parseInt(temp[2]))
                                .setYear(Integer.parseInt(temp[3]))
                                .setCustomerId(temp[4])
                                .setTotalAmount(Double.parseDouble(temp[5]))
                                .setProfitPct(Integer.parseInt(temp[6]))
                                .setProfitInr(Double.parseDouble(temp[7]))
                                .build()
                );
            }
            reader.close();
            return itemList;
        } catch (ParseException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
