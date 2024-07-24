package com.tati.classes_platform.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tati.classes_platform.domain.entities.ClassEntity;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity, Long> {

  /* acá van los métodos personalizados */

  /*
   * la palabra find para que JPA sepa que yo quiero encontrar, luego le digo cual
   * el parámetro por el cual voy a buscar donde el atributo tiene que llamarse
   * igual que la entidad
   */

  /*
   * Containing sirve para encontrar coincidencias
   */

}
