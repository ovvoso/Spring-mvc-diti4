package sn.springmvcditi4.repository;

import sn.springmvcditi4.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Integer> {
    Page<Personne> findByNomContainingIgnoreCaseOrPrenomContainingIgnoreCase(String nom, String prenom, Pageable pageable);
}
