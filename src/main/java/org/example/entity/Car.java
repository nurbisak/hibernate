package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "cars")

public class Car {
    @Id
    @SequenceGenerator(name = "car_sequence",
            sequenceName = "car_id_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator="car_sequence")

    private long id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String colour;
    @Column(name = "colour")
    private int year;

    public Car() {
    }

    public Car(String first_name, String colour, int year) {
        this.first_name = first_name;
        this.colour = colour;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                '}';
    }
}
