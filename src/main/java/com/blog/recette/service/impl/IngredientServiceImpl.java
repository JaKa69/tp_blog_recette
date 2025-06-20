package com.blog.recette.service.impl;

import com.blog.recette.model.Ingredient;
import com.blog.recette.repository.IngredientRepository;
import com.blog.recette.service.IngredientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {
    private final IngredientRepository ingredientRepository;

    public IngredientServiceImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient addIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    @Override
    public Ingredient getIngredientById(Long ingredientId) throws Exception {
        return ingredientRepository.findById(ingredientId)
            .orElseThrow(() -> new Exception("Ingredient not found with id: " + ingredientId));
    }

    @Override
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }
}
