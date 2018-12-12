package com.example.belaihou.projet1;

import java.util.ArrayList;

public class DataManager {

private static  DataManager INSTANCE;
private ArrayList<String> name=new ArrayList<>();
public static DataManager getINSTANCE()
{
    if(INSTANCE==null)
    {
        INSTANCE=new DataManager();
    }
    return INSTANCE;
}

    public ArrayList<String> getName() {
        return name;
    }
    public void addName(String s){
        name.add(s);
    }
}
