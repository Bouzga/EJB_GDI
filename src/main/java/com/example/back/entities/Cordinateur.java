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
public class Cordinateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCord;
     @Column
    Long numTel;
     @Column
    String nom;
     @Column
    String  prenom;
     @Column
    String email;
    @OneToMany
    private List<Etudiant> etudiants;

}
