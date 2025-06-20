package com.blog.recette.service;

import com.blog.recette.model.Category;
import com.blog.recette.model.Recette;

import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);
    Category getCategory(Long categoryId) throws Exception;
    List<Category> getAllCategory();
    List<Recette> getAllRecettesByCategory(Category category);
}
