package com.scalvo.profiles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scalvo.profiles.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>  {

}
