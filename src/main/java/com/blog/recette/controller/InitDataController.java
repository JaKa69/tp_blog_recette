package com.blog.recette.controller;

import com.blog.recette.model.*;
import com.blog.recette.service.*;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Controller
public class InitDataController {
    private final MembreService membreService;
    private final CategoryService categoryService;
    private final RecetteService recetteService;
    private final IngredientService ingredientService;
    private final CommentaireService commentaireService;

    public InitDataController(
        MembreService membreService,
        CategoryService categoryService,
        RecetteService recetteService,
        IngredientService ingredientService,
        CommentaireService commentaireService
    ) {
        this.membreService = membreService;
        this.categoryService = categoryService;
        this.recetteService = recetteService;
        this.ingredientService = ingredientService;
        this.commentaireService = commentaireService;
    }
    @PostConstruct
    private void init() {
        Membre membre = new Membre();
        membre.setNom("toto");
        membre.setPseudo("jaka");
        membre.setEmail("toto.jaka@gmail.com");
        membre.setMdp("toto");
        membre = membreService.addMembre(membre);

        Category categorie = new Category();
        categorie.setNom("Plat principal");
        categorie = categoryService.addCategory(categorie);

        Recette recette = new Recette();
        recette.setTitre("Tartiflette");
        recette.setDescription("Un gratin de pommes de terre au Reblochon");
        recette.setPhoto("tartiflette.jpg");
        recette.setDateCreation(LocalDate.now());
        recette.setCategory(categorie);
        recette.setMembre(membre);
        recette = recetteService.addRecette(recette);

        Ingredient ing1 = new Ingredient();
        ing1.setNom("Patate");
        ing1.setQuantite(75);
        ing1.setRecette(recette);

        Ingredient ing2 = new Ingredient();
        ing2.setNom("Fromage");
        ing2.setQuantite(3);
        ing2.setRecette(recette);

        Ingredient ing3 = new Ingredient();
        ing3.setNom("Lardons");
        ing3.setQuantite(5);
        ing3.setRecette(recette);

        ingredientService.addIngredient(ing1);
        ingredientService.addIngredient(ing2);
        ingredientService.addIngredient(ing3);

        Commentaire com = new Commentaire();
        com.setAuteur("tutu");
        com.setContenu("impeccable bien");
        com.setNote(5);
        com.setDate(LocalDate.now());
        com.setRecette(recette);

        commentaireService.addCommentaire(com);

        System.out.println("Données de test insérées !");
    }
}
