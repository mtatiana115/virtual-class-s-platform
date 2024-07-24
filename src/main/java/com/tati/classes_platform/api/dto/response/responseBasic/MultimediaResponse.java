package com.tati.classes_platform.api.dto.response.responseBasic;

import com.tati.classes_platform.util.enums.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MultimediaResponse {

  private Long id;

  private String url;

  private Type type;

  private Boolean isActive;
}
