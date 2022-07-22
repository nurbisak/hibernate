package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "girls")

public class Girl {
    @Id
    @SequenceGenerator(name = "girl_sequence",
            sequenceName = "girl_id_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "girl_sequence")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "hobby")

    private String hobby;
    @Column(name = "branch")
    private String branch;
    private int age;

    public Girl() {
    }

    public Girl(String name, String hobby, String branch, int age) {
        this.name = name;
        this.hobby = hobby;
        this.branch = branch;
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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girls{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                ", branch='" + branch + '\'' +
                ", age=" + age +
                '}';
    }
}
