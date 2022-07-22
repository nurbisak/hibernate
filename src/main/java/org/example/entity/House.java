package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "houses")
public class House {
    @Id
    @SequenceGenerator(name = "house_sequence",
    sequenceName = "house_id_sequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "house_sequence")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "street")
    private String street;
    @Column(name = "adress")
    private String adress;
    private int year;

    public House() {
    }

    public House(String name, String street, String adress, int year) {
        this.name = name;
        this.street = street;
        this.adress = adress;
        this.year = year;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", adress='" + adress + '\'' +
                ", year=" + year +
                '}';
    }
}
