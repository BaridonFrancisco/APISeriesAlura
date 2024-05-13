package com.challegerAPI.APIchallenger.repository;

import com.challegerAPI.APIchallenger.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFrasesRepository extends JpaRepository<Frase, Long> {
    @Query("SELECT f FROM Frase f ORDER BY RAND() LIMIT 1")
    Frase getRramdomFrase();
}
