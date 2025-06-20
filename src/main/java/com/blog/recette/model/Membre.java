package com.blog.recette.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Membre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom; private String pseudo; private String mdp;
    private String email;
    private Date dateInscription;
    @OneToMany(mappedBy="membre")
    private List<Recette> recettes;

}
