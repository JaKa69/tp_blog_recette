package com.blog.recette.repository;

import com.blog.recette.model.Ingredient;
import com.blog.recette.model.Recette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
 List<Ingredient> findByRecette(Recette recette);
}
