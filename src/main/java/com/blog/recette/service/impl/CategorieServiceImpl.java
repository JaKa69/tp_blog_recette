package com.blog.recette.service.impl;

import com.blog.recette.model.Category;
import com.blog.recette.model.Recette;
import com.blog.recette.repository.CategoryRepository;
import com.blog.recette.repository.RecetteRepository;
import com.blog.recette.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final RecetteRepository recetteRepository;

    public CategorieServiceImpl(CategoryRepository categoryRepository, RecetteRepository recetteRepository) {
        this.categoryRepository = categoryRepository;
        this.recetteRepository = recetteRepository;
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategory(Long categoryId) throws Exception {
        return categoryRepository.findById(categoryId)
            .orElseThrow(() -> new Exception("Category not found with id: " + categoryId));
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Recette> getAllRecettesByCategory(Category category) {
        return recetteRepository.findByCategory(category);
    }
}
