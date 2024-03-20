package com.airoport.airoports.models;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "firstname")
    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "middlname")
    private String middlname;

    public String getMiddlname() {
        return middlname;
    }

    public void setMiddlname(String middlname) {
        this.middlname = middlname;
    }

    @Basic
    @Column(name = "fullname")
    private String fullname;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Basic
    @Column(name = "age")
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "number_phone")
    private int numberPhone;

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Basic
    @Column(name = "email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "registory_date")
    private Timestamp registoryDate;

    public Timestamp getRegistoryDate() {
        return registoryDate;
    }

    public void setRegistoryDate(Timestamp registoryDate) {
        this.registoryDate = registoryDate;
    }

    @Basic
    @Column(name = "password")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && numberPhone == employee.numberPhone && Objects.equals(id, employee.id) && Objects.equals(firstname, employee.firstname) && Objects.equals(middlname, employee.middlname) && Objects.equals(fullname, employee.fullname) && Objects.equals(email, employee.email) && Objects.equals(registoryDate, employee.registoryDate) && Objects.equals(password, employee.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, middlname, fullname, age, numberPhone, email, registoryDate, password);
    }
}
