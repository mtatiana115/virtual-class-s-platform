package com.tati.classes_platform.infrastructure.interfaces;

public interface Update<RQ, RS, ID> {

  public RS update(RQ rq, ID id);

}
