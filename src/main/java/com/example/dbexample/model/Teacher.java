package com.example.dbexample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="teacher")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int teacherId;

    @Column(name="name")
    private String teacherName;
}
