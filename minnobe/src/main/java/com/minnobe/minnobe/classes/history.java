package com.minnobe.minnobe.classes;

import java.util.ArrayList;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
@Table(name = "history")
public class History {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String historyID;

    @Column(name = "historyType")
    String historyType;

    @Column(name = "history")
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
    

    @Override
    public String toString() {
        return "History [historyID=" + historyID + ", historyType=" + historyType + ", history=" + history + "]";
    }

}
