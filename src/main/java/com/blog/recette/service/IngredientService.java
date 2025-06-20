package com.blog.recette.service;

import com.blog.recette.model.Ingredient;

import java.util.List;

public interface IngredientService {
    Ingredient addIngredient(Ingredient ingredient);
    Ingredient getIngredientById(Long ingredientId);
    List<Ingredient> getAllIngredients();
}
