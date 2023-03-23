package com.example.entregaFinal.service;

import com.example.entregaFinal.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    public Producto save( Producto producto);
    public Optional<Producto> get(Integer id);
    public void update(Producto producto);
    public void delete(Integer id);
    public List<Producto> findAll();

}
