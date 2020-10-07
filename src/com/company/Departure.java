package com.company;

import java.util.Date;

public class Departure extends Flight {

    String STD;

    String Destination;


    public Departure(int flyId, String flyType, String size, Date date, String hour, String aoD, String routeNumber, String STD, String destination) {
        super(flyId, flyType, size, date, hour, aoD, routeNumber);
        this.STD = STD;
        Destination = destination;
    }

    public Departure() {

    }

    public String getSTD() {
        return STD;
    }

    public void setSTD(String STD) {
        this.STD = STD;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    @Override
    public String toString() {
        return "Departure{" +
                "STD='" + STD + '\'' +
                ", Destination='" + Destination + '\'' +
                ", flyId=" + flyId +
                ", flyType='" + flyType + '\'' +
                ", size='" + size + '\'' +
                ", date=" + date +
                ", hour='" + hour + '\'' +
                ", AoD='" + AoD + '\'' +
                ", RouteNumber='" + RouteNumber + '\'' +
                '}';
    }
}