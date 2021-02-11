package com.germangascon.frasescelebres.repo;

import com.germangascon.frasescelebres.models.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;


public interface IFraseDao extends JpaRepository<Frase, Integer> {

    @Query(value = "SELECT f,a,c FROM frase f INNER JOIN autor a on a.id = f.autor_id INNER JOIN categoria c on c.id = f.categoria_id WHERE f.fecha_programada = ?1", nativeQuery = true)
    Frase getFraseDelDia(Date fecha);

}
