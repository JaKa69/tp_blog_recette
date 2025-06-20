package com.blog.recette.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int quantite;
    private String unit;
    @ManyToOne
    private Recette recette;
}
