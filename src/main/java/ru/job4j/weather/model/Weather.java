package ru.job4j.weather.model;

/**
 * Класс Weather
 *
 * @author Nikolay Polegaev
 * @version 1.0 07.01.2022
 */
public class Weather {
    private final int id;

    private final String city;

    private final int temperature;

    public Weather(int id, String city, int temperature) {
        this.id = id;
        this.city = city;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public int getTemperature() {
        return temperature;
    }
}
