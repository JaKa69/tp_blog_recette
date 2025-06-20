package com.blog.recette.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Recette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private String author;
    private String photo;
    private LocalDate dateCreation;
    @ManyToOne
    private Membre membre;
    @ManyToOne
    private Category category;
    @OneToMany (mappedBy="recette")
    private List<Ingredient> ingredients;
    @OneToMany (mappedBy="recette")
    private List<Commentaire> commentaires;
}
