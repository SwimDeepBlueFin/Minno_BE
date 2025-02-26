package com.minnobe.minnobe.classes;

import java.util.ArrayList;
    
class Item {
        String itemid;
        String type;
        String brand;
        String description;
        String condition;
        String locationid;
        String userid;
        int rating;
        int numberofuses;
        ArrayList<String> accessories;
        String historyid;
        
    public Item(String itemid, String type, String brand, String description, String condition, String locationid,
                String userid, int rating, int numberofuses, ArrayList<String> accessories, String historyid) {
            this.itemid = itemid;
            this.type = type;
            this.brand = brand;
            this.description = description;
            this.condition = condition;
            this.locationid = locationid;
            this.userid = userid;
            this.rating = rating;
            this.numberofuses = numberofuses;
            this.accessories = accessories;
            this.historyid = historyid;
        }
    
    public String getItemid() {
            return itemid;
        }
    
    public void setItemid(String itemid) {
            this.itemid = itemid;
        }
    
    public String getType() {
            return type;
        }
    
    public void setType(String type) {
            this.type = type;
        }
    
    public String getBrand() {
            return brand;
        }
    
    public void setBrand(String brand) {
            this.brand = brand;
        }
    
    public String getDescription() {
            return description;
        }
    
    public void setDescription(String description) {
            this.description = description;
        }
    
    public String getCondition() {
            return condition;
        }
    
    public void setCondition(String condition) {
            this.condition = condition;
        }
    
    public String getLocationid() {
            return locationid;
        }
    
    public void setLocationid(String locationid) {
            this.locationid = locationid;
        }
    
    public String getUserid() {
            return userid;
        }
    
    public void setUserid(String userid) {
            this.userid = userid;
        }
    
    public int getRating() {
            return rating;
        }
    
    public void setRating(int rating) {
            this.rating = rating;
        }
    
    public int getNumberofuses() {
            return numberofuses;
        }
    
    public void setNumberofuses(int numberofuses) {
            this.numberofuses = numberofuses;
        }
    
    public ArrayList<String> getAccessories() {
            return accessories;
        }
    
    public void setAccessories(ArrayList<String> accessories) {
            this.accessories = accessories;
        }
    
    public String getHistoryid() {
            return historyid;
        }
    
    public void setHistoryid(String historyid) {
            this.historyid = historyid;
}
}       
        
