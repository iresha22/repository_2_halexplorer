package com.develhope.repositories_2.entities;

import jakarta.persistence.*;

@Entity
@Table
public class ProgrammingLanguage {
    // parameters
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    private Integer firstAppearance;
    @Column(nullable = false)
    private String inventory;

    // costruttore vuoto
    public ProgrammingLanguage(){}

    // costruttore con tutti parametri
    public ProgrammingLanguage(Long id, String name, Integer firstAppearance, String inventory) {
        this.id = id;
        this.name = name;
        this.firstAppearance = firstAppearance;
        this.inventory = inventory;
    }

    // getters and setters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(Integer firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }
}
