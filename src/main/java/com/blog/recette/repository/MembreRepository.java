package com.blog.recette.repository;

import com.blog.recette.model.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembreRepository extends JpaRepository<Membre, Long> {
    Membre findByPseudo(String pseudo);
}
