package com.blog.recette.service.impl;

import com.blog.recette.model.Membre;
import com.blog.recette.model.Recette;
import com.blog.recette.repository.MembreRepository;
import com.blog.recette.repository.RecetteRepository;
import com.blog.recette.service.MembreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembreServiceImpl implements MembreService {
    private final MembreRepository membreRepository;
    private final RecetteRepository recetteRepository;

    public MembreServiceImpl(MembreRepository membreRepository, RecetteRepository recetteRepository) {
        this.membreRepository = membreRepository;
        this.recetteRepository = recetteRepository;
    }

    @Override
    public Membre addMembre(Membre membre) {
        return membreRepository.save(membre);
    }

    @Override
    public Membre getMembre(Long membreId) throws Exception {
        return membreRepository.findById(membreId)
            .orElseThrow(() -> new Exception("Member not found with id: " + membreId));
    }

    @Override
    public List<Membre> getAllMembres() {
        return membreRepository.findAll();
    }

    @Override
    public List<Recette> getAllRecetteByMembre(Membre membre) {
        return recetteRepository.findByMembre(membre);
    }
}
