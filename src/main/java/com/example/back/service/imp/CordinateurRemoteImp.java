package com.example.back.service.imp;

import com.example.back.entities.Etudiant;
import com.example.back.repository.EtudiantRepository;
import com.example.back.service.CordinateurRemote;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Optional;

public class CordinateurRemoteImp extends UnicastRemoteObject implements CordinateurRemote {
    private EtudiantRepository etudiantRepository;

    public CordinateurRemoteImp() throws RemoteException {
    }


    @Override
    public List<Etudiant> consulterEtudiants() throws RemoteException {
        List<Etudiant> etudiants = etudiantRepository.findAll();
        System.out.println("Nombre d'étudiants : " + etudiants.size());
        return etudiants;
    }

    @Override
    public Optional<Etudiant> consulterEtudiant(Long id) throws RemoteException {
        Optional<Etudiant> etudiant = etudiantRepository.findById(id);
        return etudiant;
    }



    @Override
    public void inscrireEtudiant(Etudiant etudiant) throws RemoteException {
        String email = etudiant.getEmail();
        Optional<Etudiant> existingEtudiant = etudiantRepository.findById(etudiant.getIdEtudiant());

        if (existingEtudiant.isPresent()) {
            throw new RuntimeException("Un utilisateur existe déjà avec cet email");
        }


        etudiantRepository.save(etudiant);



        System.out.println("Étudiant inscrit avec succès !");
    }


}
