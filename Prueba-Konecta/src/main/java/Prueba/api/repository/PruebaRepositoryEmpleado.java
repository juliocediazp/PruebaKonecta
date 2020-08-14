package Prueba.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Prueba.api.entity.Empleado;

public interface PruebaRepositoryEmpleado extends JpaRepository<Empleado, String> {

}
