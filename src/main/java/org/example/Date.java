package org.example;

 class Date {
    private int day;
    private int month;
    private int year;

    public Date() {}

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day; }
    public int getMonth() {
        return month; }
    public int getYear() {
        return year; }

    public void setDay(int day) {
        this.day = day; }
    public void setMonth(int month) {
        this.month = month; }
    public void setYear(int year) {
        this.year = year; }

    public boolean equals(Date secondDate) {
        if (secondDate == null) return false;
        return (this.day == secondDate.day &&
                this.month == secondDate.month &&
                this.year == secondDate.year);
    }

    public void display() {
        System.out.println(day + "/" + month + "/" + year);
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
