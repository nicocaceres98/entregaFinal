package com.example.entregaFinal.repository;

import com.example.entregaFinal.model.Orden;
import com.example.entregaFinal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdenRepository extends JpaRepository<Orden, Integer> {
    List<Orden> findByUsuario (Usuario usuario);
}
