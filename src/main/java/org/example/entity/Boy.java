package org.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "boys")
public class Boy {
    @Id
    @SequenceGenerator(name = "boy_sequence",
    sequenceName = "boy_id_sequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "boy_sequence")
    private long id;
    @Column(name = "hight")
    private String hight;
    @Column(name = "weight")
    private String weight;
    @Column(name = "type")
    private String type;
    private int age;

    public Boy() {
    }

    public Boy(String hight, String weight, String type, int age) {
        this.hight = hight;
        this.weight = weight;
        this.type = type;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "id=" + id +
                ", hight='" + hight + '\'' +
                ", weight='" + weight + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
