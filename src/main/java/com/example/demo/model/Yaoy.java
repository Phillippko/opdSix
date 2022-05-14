package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Yaoy {

    @GeneratedValue (strategy =GenerationType.IDENTITY)
    @Id
    private long id;

    private String image;
    private String origName;
    private String name;
    @Column(length = 500)
    private String description;

}