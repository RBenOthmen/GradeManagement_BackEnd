package com.example.grademanagement_hamzarami.models;
import jakarta.persistence.*;

import java.io.Serializable;


@Entity
public class Student implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone;
    private String image_url;
    private String level;
    @Column(nullable = false)
    private String cin;
    @OneToOne
    private Subjects subjects;


    public Student() {}

    public Student(String first_name, String last_name, String email, String phone, String image_url, String level, String cin) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone = phone;
        this.image_url = image_url;
        this.level = level;
        this.cin = cin;
    }


    public Long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    /*public Subjects getSubject(int subject_name) {
        return subjects;
    }

    public void setSubject(Subjects subject) {
        this.subjects = subject;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", image_url='" + image_url + '\'' +
                ", level='" + level + '\'' +
                ", cin='" + cin + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
