package com.example.back.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Enseignant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEns;
    @Column
    String nom;
    @Column
    String prenom;
    @Column
    String email;
    @Column
    Long numTel;

    @OneToMany
    private List<Cours> cours;

    @ManyToMany
    private List<Etudiant> etudiants;

    @OneToMany
    private List<Note> notes;
}
