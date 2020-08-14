package Prueba.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import Prueba.api.entity.Solucitud;

public interface PruebaRepositorySolicitud extends JpaRepository<Solucitud, String> {

}
