package com.example.back.service;

import com.example.back.entities.Etudiant;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Optional;

public interface CordinateurRemote extends Remote {
    void inscrireEtudiant(Etudiant etudiant) throws RemoteException;
    List<Etudiant> consulterEtudiants() throws RemoteException;
    Optional<Etudiant> consulterEtudiant(Long id) throws RemoteException;

}
