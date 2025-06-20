package com.blog.recette.service;

import com.blog.recette.model.Membre;
import com.blog.recette.model.Recette;

import java.util.List;

public interface MembreService {
    Membre addMembre();
    Membre getMembre(Long membreId);
    List<Membre> getAllMembres();
    List<Recette> getAllRecetteByMembre(Membre membre);
}
