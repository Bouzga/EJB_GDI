package com.example.back.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idNote;
    @ManyToOne
    private Cours cours;
    @Column
    Double note;
    @ManyToOne
    private Etudiant etudiant;
    @ManyToOne
    private Enseignant enseignant;


}
