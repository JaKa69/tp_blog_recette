package com.blog.recette.repository;

import com.blog.recette.model.Category;
import com.blog.recette.model.Membre;
import com.blog.recette.model.Recette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecetteRepository extends JpaRepository<Recette, Long> {
    List<Recette> findByMembre(Membre membre);
    List<Recette> findByCategory(Category category);
}
