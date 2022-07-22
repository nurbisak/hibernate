package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "phones")

public class Phone {
    @Id
    @SequenceGenerator(name = "phone_sequence",
            sequenceName = "phone_id_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "phone_sequence")
    private long id;

    @Column(name = "phones")
    private String brand;
    @Column(name = "brand")
    private int price;

    public Phone() {
    }

    public Phone(String brand, int model) {
        this.brand = brand;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Phones{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model=" + price +
                '}';
    }

    public void setModel(int price) {
        this.price = price;

    }
}
