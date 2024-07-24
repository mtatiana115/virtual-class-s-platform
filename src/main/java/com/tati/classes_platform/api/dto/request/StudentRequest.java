package com.tati.classes_platform.api.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {

  @NotBlank(message = "Name is required")
  @Size(min = 2, max = 255, message = "Name must be between 2 and 255 characters")
  @Schema(description = "Name of the student", example = "John Doe")
  private String name;

  @NotBlank(message = "Email is required")
  @Size(min = 2, max = 255, message = "Email must be between 2 and 255 characters")
  @Schema(description = "Email of the student", example = "john.doe@gmail.com")
  @Email(message = "Not valid email")
  private String email;

  @NotBlank(message = "Active status is required")
  @Schema(description = "Indicates if the class is active", example = "true")
  private Boolean isActive;

}
