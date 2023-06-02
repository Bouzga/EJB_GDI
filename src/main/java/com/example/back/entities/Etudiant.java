package com.example.back.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEtudiant;

    @Column
    String nom;
    @Column
    String prenom;
    @Column
    String numAppogee;
    @Column
    Date dateNaiss;
    @Column
    String email;
    @Column
    String Password;
    @ManyToOne
    private RelveNote releveNote;
    @ManyToMany
    @JoinTable(name = "etudiant_cours",
            joinColumns = @JoinColumn(name = "etudiant_id"),
            inverseJoinColumns = @JoinColumn(name = "cours_id"))
    private List<Cours> cours;

}
