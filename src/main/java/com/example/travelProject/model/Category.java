package com.example.travelProject.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer level;
    private String description;

    @ManyToMany
    @JoinTable(name = "category_kindness",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "kindness_id"))
    private List<Kindness> kindnesses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Kindness> getKindnesses() {
        return kindnesses;
    }

    public void setKindnesses(List<Kindness> kindnesses) {
        this.kindnesses = kindnesses;
    }
}
