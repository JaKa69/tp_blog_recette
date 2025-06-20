package com.blog.recette.service;

import com.blog.recette.model.Membre;
import com.blog.recette.model.Recette;

import java.util.List;

public interface MembreService {
    Membre addMembre(Membre membre);
    Membre getMembre(Long membreId) throws Exception;
    List<Membre> getAllMembres();
    List<Recette> getAllRecetteByMembre(Membre membre);
}
