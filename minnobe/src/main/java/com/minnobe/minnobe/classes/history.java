package com.minnobe.minnobe.classes;

import java.util.ArrayList;

public class history {

    String historyID;
    ArrayList<String> history;

    public history(String historyID, ArrayList<String> history) {
        this.historyID = historyID;
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
    
}
