package com.blog.recette.service.impl;

import com.blog.recette.model.Commentaire;
import com.blog.recette.model.Ingredient;
import com.blog.recette.model.Recette;
import com.blog.recette.repository.CommentaireRepository;
import com.blog.recette.repository.IngredientRepository;
import com.blog.recette.repository.RecetteRepository;
import com.blog.recette.service.RecetteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetteServiceImpl implements RecetteService {
    private final RecetteRepository recetteRepository;
    private final IngredientRepository ingredientRepository;
    private final CommentaireRepository commentaireRepository;

    public RecetteServiceImpl(RecetteRepository recetteRepository, IngredientRepository ingredientRepository, CommentaireRepository commentaireRepository) {
        this.recetteRepository = recetteRepository;
        this.ingredientRepository = ingredientRepository;
        this.commentaireRepository = commentaireRepository;
    }


    @Override
    public Recette addRecette(Recette recette) {
        return null;
    }

    @Override
    public Recette getRecetteById(Long recetteId) throws Exception {
        return recetteRepository.findById(recetteId)
            .orElseThrow(() -> new Exception("recette not found with id: " + recetteId));
    }

    @Override
    public List<Recette> getAllRecettes() {
        return recetteRepository.findAll();
    }

    @Override
    public List<Ingredient> getAllIngredientByRecette(Recette recette) {
        return ingredientRepository.findByRecette(recette);
    }

    @Override
    public List<Commentaire> getAllCommentaireByRecette(Recette recette) {
        return commentaireRepository.findByRecette(recette);
    }
}
