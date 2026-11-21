package com.example.appareil.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categorie {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;

    @OneToMany(targetEntity = Appareil.class , mappedBy = "categorie", fetch = FetchType.EAGER)
    @JsonIgnoreProperties({"categorie"})
    List<Appareil> appareilList;

    public Categorie() {
    }

    public Categorie(Long id, String label, List<Appareil> appareilList) {
        this.id = id;
        this.label = label;
        this.appareilList = appareilList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Appareil> getAppareilList() {
        return appareilList;
    }

    public void setAppareilList(List<Appareil> appareilList) {
        this.appareilList = appareilList;
    }
}
