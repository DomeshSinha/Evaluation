package com.masai.Evaluation_5;

import java.util.ArrayList;
import java.util.HashMap;

public class Mobile {
    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    public String addMobile(String company, String model) {
        if(mobiles.containsKey(company)){
            mobiles.get(company).add(model);

        }else {
            ArrayList<String> list = new ArrayList<>();
            list.add(model);
            mobiles.put(company,list);

        }
        return "Mobile added successfully";
    }

    public ArrayList<String> getModels(String company){

        return mobiles.get(company);
    }

    public static void main(String[] args) {
        Mobile mobi = new Mobile();
        mobi.addMobile("apple","iphone 13");
        mobi.addMobile("Mi","Note 10");
        mobi.addMobile("Samsung","Galaxy");
        mobi.addMobile("Oppo","F6");
        mobi.addMobile("apple","iphone12");

        ArrayList<String> mod = mobi.getModels("Mi");
        System.out.println(mod);
    }
}
