package com.example.back.repository;

import com.example.back.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    @Query("select e from Etudiant e where e.nom like CONCAT('%', :nom, '%')")
    List<Etudiant> findByName(@Param("nom") String nom);
    List<Etudiant> findAll();
    @Modifying
    @Query("delete from Etudiant u where u.idEtudiant=:id")
    void deleteEtudiant(Long id);
}
