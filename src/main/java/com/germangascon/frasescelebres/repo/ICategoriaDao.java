package com.germangascon.frasescelebres.repo;

import com.germangascon.frasescelebres.models.Categoria;
import com.germangascon.frasescelebres.models.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ICategoriaDao extends JpaRepository<Categoria, Integer> {
    @Query(value="SELECT * FROM categoria ORDER BY categoria.id LIMIT 10 OFFSET ?1", nativeQuery = true)
    List<Categoria> getCategoriasLimit(int offset);
}
