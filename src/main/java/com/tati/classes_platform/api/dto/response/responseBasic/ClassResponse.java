package com.tati.classes_platform.api.dto.response.responseBasic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClassResponse {

  private Long id;

  private String name;

  private String description;

  private String createdAt;

  private Boolean isActive;

}
