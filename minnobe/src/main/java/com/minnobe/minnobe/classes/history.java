package com.minnobe.minnobe.classes;

import java.util.ArrayList;

public class History {
   
       //TODO  - This is to be weeded out.
    String historyID;
    String historyType;
    ArrayList<String> history;

    public History(String historyID, String historyType, ArrayList<String> history) {
        super();
        this.historyID = historyID;
        this.historyType = historyType;
        this.history = history;
    }
 


    public String getHistoryID() {
        return historyID;
    }
    public void setHistoryID(String historyID) {
        this.historyID = historyID;
    }
    public ArrayList<String> getHistory() {
        return history;
    }
    public void setHistory(ArrayList<String> history) {
        this.history = history;
    }
    public String getHistoryType() {
        return historyType;
    }
    public void setHistoryType(String historyType) {
        this.historyType = historyType;
    }
    
}
