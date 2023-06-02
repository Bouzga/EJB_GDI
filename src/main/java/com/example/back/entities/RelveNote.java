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
public class RelveNote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long idRN;
    @Column
   private String semestre;
    @Column
    private String nomMatiere;

    @OneToMany
    @JoinColumn(name = "relve_note_id")
    private List<Note> notes;

}
