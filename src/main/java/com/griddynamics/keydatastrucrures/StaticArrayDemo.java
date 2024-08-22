package com.griddynamics.keydatastrucrures;

import java.time.LocalDateTime;

public class StaticArrayDemo {
    public static void main(String[] args) {
        TemperatureRecord [] temperatureRecords = new TemperatureRecord[100_000_000];
        temperatureRecords[0] = new TemperatureRecord(23.5, LocalDateTime.now(), "NY");
        temperatureRecords[99_999_999] = new TemperatureRecord(13.5, LocalDateTime.now(), "Tokyo");
        temperatureRecords[2] = new TemperatureRecord(-3.8, LocalDateTime.now(), "London");

        System.out.println("tr1 " + temperatureRecords[99_999_999]);

        for (TemperatureRecord temperatureRecord : temperatureRecords) {
            if (temperatureRecord != null && temperatureRecord.getCity().equals("Tokyo")) {
                System.out.println("Temperature in Tokyo: " + temperatureRecord.getTemperature());
            }
        }
    }
}
