package com.tati.classes_platform.infrastructure.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FindAllByName<RS> {

  public Page<RS> findAllByName(Pageable pageable, String name);

}
