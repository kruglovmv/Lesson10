package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelephoneBook extends HashMap<String, ArrayList<String>>{
    public TelephoneBook() {
   }
    public void add(String key, String value){
        if(this.containsKey(key)) super.get(key).add(value);
        else { ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add(value);
            this.put(key,arrayList);}
    }
    public ArrayList get(String key){
        return super.get(key);
    }
}
