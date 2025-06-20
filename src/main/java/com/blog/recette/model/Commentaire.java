package com.blog.recette.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String auteur;
    private String contenu;
    private int note;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "recette_id")
    private Recette recette;
}
