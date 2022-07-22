package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @SequenceGenerator(name = "city_sequence",
            sequenceName = "city_id_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "city_sequence")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "streets")
    private String streets;

    private int age;

    public City() {
    }

    public City(String name, String streets, int age) {
        this.name = name;
        this.streets = streets;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreets() {
        return streets;
    }

    public void setStreets(String streets) {
        this.streets = streets;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", streets='" + streets + '\'' +
                ", age=" + age +
                '}';
    }
}
