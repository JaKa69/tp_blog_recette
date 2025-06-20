package com.blog.recette.service;

import com.blog.recette.model.Commentaire;

import java.util.List;

public interface CommentaireService {
    Commentaire addCommentaire(Commentaire commentaire);
    Commentaire getCommentaireById(Long commentaireId);
    List<Commentaire> getAllCommentaires();
}
