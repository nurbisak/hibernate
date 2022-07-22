package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "actors")
public class Actor {
    @Id
    @SequenceGenerator(name = "actor_sequence",
            sequenceName = "actor_id_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "actor_sequence")
    private long id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "country")
    private String country;
    private int age;

    public Actor() {
    }

    public Actor(String first_name, String nickname, String country, int age) {
        this.first_name = first_name;
        this.nickname = nickname;
        this.country = country;
        this.age = age;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actors{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                '}';
    }
}
