package com.tati.classes_platform.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tati.classes_platform.domain.entities.Multimedia;

@Repository
public interface MultimediaRepository extends JpaRepository<Multimedia, Long> {

}
