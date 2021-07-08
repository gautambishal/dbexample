package com.example.dbexample.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="student")
@Getter
@Setter
@ToString
public class Student {
    //ORM->Object Relational Mapping
    //object->Class
    //Relational-> database table
    //static,transient
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int studentId;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

}
