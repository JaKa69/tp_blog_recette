package com.blog.recette.service;

import com.blog.recette.model.Commentaire;
import com.blog.recette.model.Ingredient;
import com.blog.recette.model.Recette;

import java.util.List;

public interface RecetteService {
    Recette addRecette(Recette recette);
    Recette getRecetteById(Long recetteId) throws Exception;
    List<Recette> getAllRecettes();
    List<Ingredient> getAllIngredientByRecette(Recette recette);
    List<Commentaire> getAllCommentaireByRecette(Recette recette);
}
