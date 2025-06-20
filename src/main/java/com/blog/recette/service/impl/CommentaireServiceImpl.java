package com.blog.recette.service.impl;

import com.blog.recette.model.Commentaire;
import com.blog.recette.repository.CommentaireRepository;
import com.blog.recette.service.CommentaireService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaireServiceImpl implements CommentaireService {
    private final CommentaireRepository commentaireRepository;

    public CommentaireServiceImpl(CommentaireRepository commentaireRepository) {
        this.commentaireRepository = commentaireRepository;
    }

    @Override
    public Commentaire addCommentaire(Commentaire commentaire) {
        return commentaireRepository.save(commentaire);
    }

    @Override
    public Commentaire getCommentaireById(Long commentaireId) throws Exception {
        return commentaireRepository.findById(commentaireId)
            .orElseThrow(() -> new Exception("Commentaire not found with id: " + commentaireId));
    }

    @Override
    public List<Commentaire> getAllCommentaires() {
        return commentaireRepository.findAll();
    }
}
