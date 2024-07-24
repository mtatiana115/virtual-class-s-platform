package com.tati.classes_platform.infrastructure.abstract_services;

public interface CrudService<RQ, RS, ID> {

  public RS create(RQ rq);

  public RS update(RQ rq);

  public RS findById(ID id);

  public void delete(ID id);

}
