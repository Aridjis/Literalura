package com.aluracursos.literalura.repository;

import com.aluracursos.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Autor findAutorByNombreIgnoreCase(String nombre);
    List<Autor> findAutorByFechaDeNacimientoLessThanEqualAndFechaDeFallecimientoGreaterThanEqual(int fechaDeNacimiento, int fechaDeFallecimiento);
}
