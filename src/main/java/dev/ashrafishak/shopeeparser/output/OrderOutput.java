package dev.ashrafishak.shopeeparser.output;

import java.util.ArrayList;
import java.util.Calendar;

public class OrderOutput {

    private String date;
    private Calendar dateCalendar;
    private String totalAmount;
    private ArrayList<String> items;

    public OrderOutput() {
        this.items = new ArrayList<String>();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public Calendar getDateCalendar() {
        return dateCalendar;
    }

    public void setDateCalendar(Calendar dateCalendar) {
        this.dateCalendar = dateCalendar;
    }
}
