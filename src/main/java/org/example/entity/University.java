package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "universities")
public class University {
    @Id
    @SequenceGenerator(name = "university_sequence",
            sequenceName = "university_id_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "university_sequence")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    private int year;

    public University() {
    }

    public University(String name, String type, int year) {
        this.name = name;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                '}';
    }
}
