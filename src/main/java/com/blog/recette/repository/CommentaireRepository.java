package com.blog.recette.repository;

import com.blog.recette.model.Commentaire;
import com.blog.recette.model.Recette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
    List<Commentaire> findByRecette(Recette recette);
}
