package com.company;

import java.time.LocalDateTime;


public class Holiday {
    private String name;
    private int month;
    private int dayOfMonth;
    private String description;
    private boolean isFederallyRecognized;

    public Holiday(String name, int month, int dayOfMonth, String description, boolean isFederallyRecognized) {
        this.name = name;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.description = description;
        this.isFederallyRecognized = isFederallyRecognized;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFederallyRecognized() {
        return isFederallyRecognized;
    }
    public String toString() {
        return name + " is on " + month + " " + dayOfMonth + " " + description + " " + isFederallyRecognized;
    }
    public boolean isFederal() {
        return isFederallyRecognized;
    }
    public boolean isToday() {
        LocalDateTime now = LocalDateTime.now();
        int day = now.getDayOfMonth();
        int isMonth = now.getMonthValue();
        return day == dayOfMonth && month == isMonth;
    }
}
